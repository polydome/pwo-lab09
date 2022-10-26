package pwo.lab09.builder;

import java.io.File;

import static java.lang.System.exit;

public class TxtPic3 extends TxtPic2 {
    private boolean isFileNameValid() {
        if (fileName != null) {
            return !fileName.isBlank();
        }

        return false;
    }

    private boolean isForegroundSet() {
        return foreground != '\u0000';
    }

    private boolean isBackgroundSet() {
        return background != '\u0000';
    }

    private boolean isSizeValid() {
        return size > 0;
    }

    @Override
    public TxtPic2 createTxtPic() {
        if (!isForegroundSet()) {
            throw new ValidationFailedException("Foreground not set!");
        }

        if (!isBackgroundSet()) {
            throw new ValidationFailedException("Background not set!");
        }

        if (!isSizeValid()) {
            throw new ValidationFailedException("Size not valid!");
        }

        if (!isFileNameValid()) {
            throw new ValidationFailedException("File name not valid!");
        }

        return super.createTxtPic();
    }
}
