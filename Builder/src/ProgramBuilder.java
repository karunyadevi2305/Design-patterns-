/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class ProgramBuilder {
    private String sourceCode;
    private String compilerFlags;
    private String outputFile;

    public ProgramBuilder setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    public ProgramBuilder setCompilerFlags(String compilerFlags) {
        this.compilerFlags = compilerFlags;
        return this;
    }

    public ProgramBuilder setOutputFile(String outputFile) {
        this.outputFile = outputFile;
        return this;
    }

    public Program build() {
        return new Program(sourceCode, compilerFlags, outputFile);
    }
}
