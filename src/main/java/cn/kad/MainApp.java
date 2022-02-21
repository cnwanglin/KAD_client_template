package cn.kad;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        // 首先，netty通过ServerBootstrap启动服务端
        Bootstrap client = new Bootstrap();



        //第1步 定义线程组，处理读写和链接事件，没有了accept事件
        EventLoopGroup group = new NioEventLoopGroup();
        client.group(group );

        //第2步 绑定客户端通道
        client.channel(NioSocketChannel.class);
        System.out.println("4");
        //第3步 给NIoSocketChannel初始化handler， 处理读写事件
        client.handler(new ChannelInitializer<NioSocketChannel>() {  //通道是NioSocketChannel
            @Override
            protected void initChannel(NioSocketChannel ch) throws Exception {
                //字符串编码器，一定要加在SimpleClientHandler 的上面
                //ch.pipeline().addLast(new StringEncoder());
               // ch.pipeline().addLast(new DelimiterBasedFrameDecoder(
                //        Integer.MAX_VALUE, Delimiters.lineDelimiter()[0]));
                //找到他的管道 增加他的handler
               //
                ByteBuf buf = Unpooled.copiedBuffer("E".getBytes());
                ch.pipeline().addLast(new StringEncoder());
                ch.pipeline().addLast(new DelimiterBasedFrameDecoder(1024, buf));
                //设置字符串形式的解码
                ch.pipeline().addLast(new StringDecoder());
                ch.pipeline().addLast(new SimpleClientHandler());

            }
        });
        System.out.println("3");
        //连接服务器
        ChannelFuture future = client.connect("59.110.42.206", 8084).sync();

        //发送数据给服务器
        //User user = new User();
       // user.setAge(12);
       // user.setId(1);
        //user.setName("sssss");
        //future.channel().writeAndFlush(JSONObject.toJSONString(user)+"\r\n");
        System.out.println("2");
        for(int i=0;i<5;i++){
            String msg = "ssss"+i+"\r\n";
            future.channel().writeAndFlush(msg);
        }

        //当通道关闭了，就继续往下走
        future.channel().closeFuture().sync();
        //System.out.println("1");

        //接收服务端返回的数据
        //AttributeKey<String> key = AttributeKey.valueOf("ServerData");
       // Object result = future.channel().attr(key).get();
        //System.out.println(result.toString());
    }
}
