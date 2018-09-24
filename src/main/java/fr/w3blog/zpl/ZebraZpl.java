/*
 * Copyright 2018 Desarrollo2.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.w3blog.zpl;

import fr.w3blog.zpl.constant.ZebraFont;
import fr.w3blog.zpl.model.ZebraLabel;
import fr.w3blog.zpl.model.ZebraPrintException;
import fr.w3blog.zpl.model.element.ZebraBarCode128;
import fr.w3blog.zpl.model.element.ZebraQRBarCode;
import fr.w3blog.zpl.model.element.ZebraText;
import fr.w3blog.zpl.utils.ZebraUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Desarrollo2
 */
public class ZebraZpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZebraLabel zebraLabel = new ZebraLabel(912, 912);
        zebraLabel.setDefaultZebraFont(ZebraFont.ZEBRA_ZERO);

        zebraLabel.addElement(new ZebraText(90, 45, "TITULO1", 7));
        zebraLabel.addElement(new ZebraText(95, 74, "TITULO2", 7));

        //Add Code Bar 
        zebraLabel.addElement(new ZebraQRBarCode(460, 200, "http://www.google.com"));
        zebraLabel.addElement(new ZebraBarCode128(443, 244, "0123456789", 40, 1, 3));

        zebraLabel.addElement(new ZebraText(95, 257, "NOMBRE", 7));
        zebraLabel.addElement(new ZebraText(95, 297, "Id: 8080", 7));

        zebraLabel.addElement(new ZebraText(460, 298, "$", 7));
        zebraLabel.addElement(new ZebraText(490, 298, "100", 7));

        String text = zebraLabel.getZplCode();
        System.out.println(text);

        try {
            ZebraUtils.printZpl(zebraLabel, "192.168.0.217", 9100);
        } catch (ZebraPrintException ex) {
            Logger.getLogger(ZebraZpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
