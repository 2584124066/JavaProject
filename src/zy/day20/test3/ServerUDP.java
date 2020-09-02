package zy.day20.test3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(7777);
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 1024);
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength()) + " from " + dp.getAddress().getHostAddress() + ":" + dp.getPort();
        System.out.println(str);
        ds.close();

    }
}
