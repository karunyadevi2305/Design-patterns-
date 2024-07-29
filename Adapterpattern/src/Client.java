/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class Client {
    public static void main(String[] args) {
        ClientMessage message = new ClientMessageImpl("Hello, Server!");
        NetworkSender sender = new NetworkSender();
        byte[] data = sender.sendMessage(message);
        NetworkReceiver receiver = new NetworkReceiver();
        receiver.receiveMessage(data);
    }
}
