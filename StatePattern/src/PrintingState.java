/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
/**
 * Represents the printing state of the printer.
 */
public class PrintingState implements PrinterState {
    private Printer printer;

    /**
     * Constructs a new printing state for the given printer.
     *
     * @param printer the printer
     */
    public PrintingState(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.println("Already printing.");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling print job...");
        printer.setState(new IdleState(printer));
    }

    @Override
    public void pause() {
        System.out.println("Pausing print job...");
        printer.setState(new PausedState(printer));
    }

    @Override
    public void resume() {
        System.out.println("Already printing.");
    }
}