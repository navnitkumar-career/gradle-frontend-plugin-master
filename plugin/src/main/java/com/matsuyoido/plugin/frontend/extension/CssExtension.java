package com.matsuyoido.plugin.frontend.extension;

import java.io.File;
import java.io.Serializable;

/**
 * ex.
 * <pre>
 * ___ {
 *     inDir = file("$projectDir/src/main/sass")
 *     outDir = file("$projectDir/src/main/resources/static/css")
 *     addPrefixer = false
 * }
 * </pre>
 */
public class CssExtension implements Serializable {
    private static final long serialVersionUID = 5074741537940502479L;

    private File inputDirectory;
    private File outputDirectory;
    private boolean addPrefixer;

    public void setInDir(File path) {
        this.inputDirectory = path;
    }
    public void setOutDir(File path) {
        this.outputDirectory = path;
    }
    public void setAddPrefixer(boolean isAdd) {
        this.addPrefixer = isAdd;
    }


    public File getInputDirectory() {
        return this.inputDirectory;
    }
    public File getOutputDirectory() {
        return this.outputDirectory;
    }
    public boolean isAddPrefixer() {
        return this.addPrefixer;
    }

}