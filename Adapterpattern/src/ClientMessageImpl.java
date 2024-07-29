/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class ClientMessageImpl implements ClientMessage {
    private String message;

    public ClientMessageImpl(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}