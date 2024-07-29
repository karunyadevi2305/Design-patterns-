/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
/**
 * Represents the idle state of the printer.
 */
public class IdleState implements PrinterState {
    private Printer printer;

    /**
     * Constructs a new idle state for the given printer.
     *
     * @param printer the printer
     */
    public IdleState(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.println("Printing...");
        printer.setState(new PrintingState(printer));
    }

    @Override
    public void cancel() {
        System.out.println("Nothing to cancel.");
    }

    @Override
    public void pause() {
        System.out.println("Nothing to pause.");
    }

    @Override
    public void resume() {
        System.out.println("Nothing to resume.");
    }
}
