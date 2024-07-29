/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
/**
 * Represents a printer that can be in different states.
 */
public class Printer {
    private PrinterState state;

    /**
     * Constructs a new printer in the idle state.
     */
    public Printer() {
        this.state = new IdleState(this);
    }

    /**
     * Sets the state of the printer.
     *
     * @param state the new state
     */
    public void setState(PrinterState state) {
        this.state = state;
    }

    /**
     * Prints a document.
     */
    public void print() {
        state.print();
    }

    /**
     * Cancels a print job.
     */
    public void cancel() {
        state.cancel();
    }

    /**
     * Puts the printer in a paused state.
     */
    public void pause() {
        state.pause();
    }

    /**
     * Resumes a paused print job.
     */
    public void resume() {
        state.resume();
    }
}