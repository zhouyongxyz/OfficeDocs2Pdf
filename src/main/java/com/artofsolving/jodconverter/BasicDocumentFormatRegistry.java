package com.artofsolving.jodconverter;

/**
 * @author 李文浩
 * @date 2017/12/25
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicDocumentFormatRegistry implements DocumentFormatRegistry {
    private List documentFormats = new ArrayList();

    public BasicDocumentFormatRegistry() {
    }

    public void addDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormats.add(documentFormat);
    }

    protected List getDocumentFormats() {
        return this.documentFormats;
    }

    public DocumentFormat getFormatByFileExtension(String extension) {
        if (extension == null) {
            return null;
        } else {
            if (extension.indexOf("doc") >= 0) {
                extension = "doc";
            }
            if (extension.indexOf("ppt") >= 0) {
                extension = "ppt";
            }
            if (extension.indexOf("xls") >= 0) {
                extension = "xls";
            }
            String lowerExtension = extension.toLowerCase();
            Iterator it = this.documentFormats.iterator();

            DocumentFormat format;
            do {
                if (!it.hasNext()) {
                    return null;
                }

                format = (DocumentFormat)it.next();
            } while(!format.getFileExtension().equals(lowerExtension));

            return format;
        }
    }

    public DocumentFormat getFormatByMimeType(String mimeType) {
        Iterator it = this.documentFormats.iterator();

        DocumentFormat format;
        do {
            if (!it.hasNext()) {
                return null;
            }

            format = (DocumentFormat)it.next();
        } while(!format.getMimeType().equals(mimeType));

        return format;
    }
}
