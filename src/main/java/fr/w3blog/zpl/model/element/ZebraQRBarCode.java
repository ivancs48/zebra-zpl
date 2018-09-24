package fr.w3blog.zpl.model.element;

import fr.w3blog.zpl.constant.Correcion;
import fr.w3blog.zpl.constant.MagnificaFactor;
import fr.w3blog.zpl.constant.Modelo;
import fr.w3blog.zpl.model.PrinterOptions;
import fr.w3blog.zpl.utils.ZplUtils;

/**
 * Element to create a QR bar code
 *
 * Zpl command : ^BQ
 *
 * @author matthiasvets
 *
 */
public class ZebraQRBarCode extends ZebraBarCode {

    public ZebraQRBarCode(int positionX, int positionY, String text) {
        super(positionX, positionY, text);
    }

    public ZebraQRBarCode(int positionX, int positionY, String text, Modelo modelo, MagnificaFactor magnificaFactor, Correcion correcion) {
        super(positionX, positionY, text, modelo, magnificaFactor, correcion);
    }

    @Override
    public String getZplCode(PrinterOptions printerOptions) {
        StringBuilder zpl = getStartZplCodeBuilder();
        zpl.append(ZplUtils.zplCommandSautLigne("BQ", zebraRotation.getLetter(), modelo.getModelo(), magnificaFactor.getMagnificaFactor()));
        zpl.append("^FDM").append(correcion.getCorrecion());
        zpl.append(text);
        zpl.append(ZplUtils.zplCommandSautLigne("FS"));
        return zpl.toString();
    }

}
