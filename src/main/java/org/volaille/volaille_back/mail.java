package org.volaille.volaille_back;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import okhttp3.*;
import org.volaille.volaille_front.Main_Controller;

import java.io.IOException;


public class mail {
    public static void EnvoiInventaire(String total_canard, String valeur_stock_canard, String total_poulet, String valeur_stock_poulet, String email_destinataire) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\"sender\":{\"name\":\"Volaille\",\"email\":\"noreply@bounceb.arthurd.fr\"}," +
                "\"replyTo\":{\"email\":\"noreply@bounceb.arthurd.fr\",\"name\":\"No reply\"}," +
                "\"params\":{\"newKey\":\"New Value\"}," +
                "\"to\":[{\"email\":\""+email_destinataire+"\"}]," +
                "\"subject\":\"Test\"," +
                "\"htmlContent\":\"<!DOCTYPE html PUBLIC \\\"-//W3C//DTD XHTML 1.0 Strict//EN\\\" \\\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\\\"> <html xmlns=\\\"http://www.w3.org/1999/xhtml\\\" xmlns:v=\\\"urn:schemas-microsoft-com:vml\\\" xmlns:o=\\\"urn:schemas-microsoft-com:office:office\\\"><head><meta http-equiv=\\\"Content-Type\\\" content=\\\"text/html; charset=utf-8\\\"><meta http-equiv=\\\"X-UA-Compatible\\\" content=\\\"IE=edge\\\"><meta name=\\\"format-detection\\\" content=\\\"telephone=no\\\"><meta name=\\\"viewport\\\" content=\\\"width=device-width, initial-scale=1.0\\\"><title>Rapport volaille</title><style type=\\\"text/css\\\" emogrify=\\\"no\\\">#outlook a { padding:0; } .ExternalClass { width:100%; } .ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div { line-height: 100%; } table td { border-collapse: collapse; mso-line-height-rule: exactly; } .editable.image { font-size: 0 !important; line-height: 0 !important; } .nl2go_preheader { display: none !important; mso-hide:all !important; mso-line-height-rule: exactly; visibility: hidden !important; line-height: 0px !important; font-size: 0px !important; } body { width:100% !important; -webkit-text-size-adjust:100%; -ms-text-size-adjust:100%; margin:0; padding:0; } img { outline:none; text-decoration:none; -ms-interpolation-mode: bicubic; } a img { border:none; } table { border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt; } th { font-weight: normal; text-align: left; } *[class=\\\"gmail-fix\\\"] { display: none !important; } </style><style type=\\\"text/css\\\" emogrify=\\\"no\\\"> @media (max-width: 600px) { .gmx-killpill { content: ' \\\\03D1';} } </style><style type=\\\"text/css\\\" emogrify=\\\"no\\\">@media (max-width: 600px) { .gmx-killpill { content: ' \\\\03D1';} .r0-o { border-style: solid !important; margin: 0 auto 0 auto !important; width: 100% !important } .r1-i { background-color: transparent !important } .r2-c { box-sizing: border-box !important; text-align: center !important; valign: top !important; width: 320px !important } .r3-o { border-style: solid !important; margin: 0 auto 0 auto !important; width: 320px !important } .r4-i { padding-bottom: 5px !important; padding-top: 5px !important } .r5-c { box-sizing: border-box !important; display: block !important; valign: top !important; width: 100% !important } .r6-o { border-style: solid !important; width: 100% !important } .r7-i { padding-left: 10px !important; padding-right: 10px !important; padding-top: 20px !important; text-align: center !important } .r8-i { background-color: #082c4e !important } .r9-i { padding-bottom: 30px !important; padding-top: 40px !important } .r10-o { border-style: solid !important; margin: 0 auto 0 auto !important; width: 54px !important } .r11-c { box-sizing: border-box !important; text-align: center !important; valign: top !important; width: 100% !important } .r12-i { background-color: #ffffff !important; padding-bottom: 0px !important; padding-left: 10px !important; padding-right: 10px !important; padding-top: 20px !important } .r13-o { border-style: solid !important; margin: 0 auto 0 0 !important; width: 100% !important } .r14-i { text-align: left !important } .r15-i { padding-top: 15px !important } .r16-i { background-color: #ffffff !important; padding-bottom: 0px !important; padding-left: 10px !important; padding-right: 10px !important; padding-top: 25px !important } .r17-i { background-color: #ffffff !important; padding-bottom: 0px !important; padding-left: 10px !important; padding-right: 10px !important; padding-top: 15px !important } .r18-c { box-sizing: border-box !important; valign: top !important; width: 8.33% !important } .r19-o { border-style: solid !important; margin: 0 auto 0 auto !important; width: 9px !important } .r20-i { padding-top: 11px !important } .r21-c { box-sizing: border-box !important; valign: top !important; width: 91.67% !important } .r22-i { padding-left: 0px !important; text-align: left !important } .r23-i { background-color: #ffffff !important; padding-bottom: 0px !important; padding-left: 10px !important; padding-right: 10px !important; padding-top: 10px !important } .r24-i { background-color: #ffffff !important; padding-bottom: 25px !important; padding-left: 10px !important; padding-right: 10px !important; padding-top: 25px !important } .r25-i { padding-top: 15px !important; text-align: left !important } .r26-i { padding-top: 11px !important; text-align: left !important } .r27-i { padding-bottom: 30px !important; padding-left: 10px !important; padding-right: 10px !important; padding-top: 25px !important } .r28-i { padding-top: 30px !important; text-align: center !important } body { -webkit-text-size-adjust: none } .nl2go-responsive-hide { display: none } .nl2go-body-table { min-width: unset !important } .mobshow { height: auto !important; overflow: visible !important; max-height: unset !important; visibility: visible !important; border: none !important } .resp-table { display: inline-table !important } .magic-resp { display: table-cell !important } } </style><!--[if !mso]><!--><style type=\\\"text/css\\\" emogrify=\\\"no\\\">@import url(\\\"https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&family=Mr+Dafoe&family=Quicksand:wght@500;700&display=swap\\\"); </style><!--<![endif]--><style type=\\\"text/css\\\">p, h1, h2, h3, h4, ol, ul, li { margin: 0; } a, a:link { color: #404F5E; text-decoration: none } .nl2go-default-textstyle { color: #3E3E3E; font-family: Montserrat, Helvetica, Arial, sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word } .default-button { color: #3E3E3E; font-family: Montserrat, Helvetica, Arial, sans-serif; font-size: 20px; font-style: normal; font-weight: normal; line-height: 1.15; text-decoration: none; word-break: break-word } .sib_class_16_white_reg_u { color: #FFFFFF; font-family: Montserrat, Helvetica, Arial, sans-serif; font-size: 16px; text-decoration: underline; word-break: break-word } .sib_class_18_white_reg { color: #FFFFFF; font-family: Montserrat, Helvetica, Arial, sans-serif; font-size: 18px; word-break: break-word } .sib_class_18_white_quicksand_m_up { color: #FFFFFF; font-family: Quicksand, Helvetica, Arial, sans-serif; font-size: 18px; font-weight: 500; letter-spacing: 0.1em; text-transform: uppercase; word-break: break-word } .sib_class_20_darkblue_reg_u { color: #404F5E; font-family: Montserrat, Helvetica, Arial, sans-serif; font-size: 20px; text-decoration: underline; word-break: break-word } .sib_class_20_black_reg { color: #3E3E3E; font-family: Montserrat, Helvetica, Arial, sans-serif; font-size: 20px; word-break: break-word } .sib_class_20_black_b { color: #3E3E3E; font-family: Montserrat, Helvetica, Arial, sans-serif; font-size: 20px; font-weight: 700; word-break: break-word } .sib_class_26_black_quicksand_b { color: #3E3E3E; font-family: Quicksand, Helvetica, Arial, sans-serif; font-size: 26px; font-weight: 700; letter-spacing: 0.1em; word-break: break-word } .sib_class_32_black_mrdafoe_reg { color: #3E3E3E; font-family: Mr Dafoe, Helvetica, Arial, sans-serif; font-size: 32px; word-break: break-word } .default-heading1 { color: #3e3e3e; font-family: Quicksand, Helvetica, Arial, sans-serif; font-size: 26px; font-weight: 700; letter-spacing: 0.1em; word-break: break-word } .default-heading2 { color: #1F2D3D; font-family: arial,helvetica,sans-serif; font-size: 32px; word-break: break-word } .default-heading3 { color: #1F2D3D; font-family: arial,helvetica,sans-serif; font-size: 24px; word-break: break-word } .default-heading4 { color: #1F2D3D; font-family: arial,helvetica,sans-serif; font-size: 18px; word-break: break-word } a[x-apple-data-detectors] { color: inherit !important; text-decoration: inherit !important; font-size: inherit !important; font-family: inherit !important; font-weight: inherit !important; line-height: inherit !important; } .no-show-for-you { border: none; display: none; float: none; font-size: 0; height: 0; line-height: 0; max-height: 0; mso-hide: all; overflow: hidden; table-layout: fixed; visibility: hidden; width: 0; } </style><!--[if mso]><xml> <o:OfficeDocumentSettings> <o:AllowPNG/> <o:PixelsPerInch>96</o:PixelsPerInch> </o:OfficeDocumentSettings> </xml><![endif]--><style type=\\\"text/css\\\">a:link{color: #404f5e; text-decoration: none;}</style></head><body bgcolor=\\\"#082c4e\\\" text=\\\"#3E3E3E\\\" link=\\\"#404F5E\\\" yahoo=\\\"fix\\\" style=\\\"background-color: #082c4e;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" class=\\\"nl2go-body-table\\\" width=\\\"100%\\\" style=\\\"background-color: #082c4e; width: 100%;\\\"><tr><td> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td valign=\\\"top\\\" class=\\\"r1-i\\\" style=\\\"background-color: transparent;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"600\\\" align=\\\"center\\\" class=\\\"r3-o\\\" style=\\\"table-layout: fixed;\\\"><tr><td class=\\\"r4-i\\\" style=\\\"padding-bottom: 5px; padding-top: 5px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"100%\\\" valign=\\\"top\\\" class=\\\"r5-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"center\\\" class=\\\"r7-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; padding-left: 30px; padding-right: 30px; padding-top: 20px; text-align: center;\\\"> <div><p style=\\\"margin: 0;\\\"><a href=\\\"{{ mirror }}\\\" style=\\\"color: #404f5e; text-decoration: none;\\\"><span style=\\\"color: #ffffff; font-size: 16px;\\\"><u>Afficher dans le navigateur</u></span></a></p></div> </td> </tr></table></th> </tr></table></td> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td valign=\\\"top\\\" class=\\\"r8-i\\\" style=\\\"background-color: #082c4e;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"600\\\" align=\\\"center\\\" class=\\\"r3-o\\\" style=\\\"table-layout: fixed; width: 600px;\\\"><tr><td class=\\\"r9-i\\\" style=\\\"padding-bottom: 30px; padding-top: 40px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"100%\\\" valign=\\\"top\\\" class=\\\"r5-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"54\\\" align=\\\"center\\\" class=\\\"r10-o\\\" style=\\\"table-layout: fixed; width: 54px;\\\"><tr><td style=\\\"font-size: 0px; line-height: 0px;\\\"> <img src=\\\"https://img.mailinblue.com/2670624/images/rnb/original/5f0318129f4f2387c56b8f29.png\\\" width=\\\"54\\\" border=\\\"0\\\" style=\\\"display: block; width: 100%;\\\"></td> </tr></table></th> </tr></table></td> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"600\\\" align=\\\"center\\\" class=\\\"r3-o\\\" style=\\\"table-layout: fixed; width: 600px;\\\"><tr><td valign=\\\"top\\\" class=\\\"r8-i\\\" style=\\\"background-color: #082c4e;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td class=\\\"r12-i\\\" style=\\\"background-color: #ffffff; padding-left: 20px; padding-right: 20px; padding-top: 20px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"100%\\\" valign=\\\"top\\\" class=\\\"r5-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r14-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; text-align: left;\\\"> <div><h1 class=\\\"default-heading1\\\" style=\\\"margin: 0; color: #3e3e3e; font-family: Quicksand,Helvetica,Arial,sans-serif; font-size: 26px; font-weight: 700; letter-spacing: .1em; word-break: break-word;\\\">Inventaire de la volaille</h1></div> </td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"560\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed;\\\"><tr><td class=\\\"r15-i\\\" style=\\\"padding-top: 15px; height: 1px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><td><table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" class=\\\"r15-i\\\" height=\\\"1\\\" style=\\\"border-top-style: solid; background-clip: border-box; border-top-color: #181c20; border-top-width: 1px; font-size: 1px; line-height: 1px;\\\"><tr><td height=\\\"0\\\" style=\\\"font-size: 0px; line-height: 0px;\\\">­</td> </tr></table></td> </tr></table></td> </tr></table></th> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td class=\\\"r16-i\\\" style=\\\"background-color: #ffffff; padding-left: 20px; padding-right: 20px; padding-top: 25px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"100%\\\" valign=\\\"top\\\" class=\\\"r5-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r14-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; text-align: left;\\\"> <div><p style=\\\"margin: 0;\\\">Cher utilisateur,<br> </p><p style=\\\"margin: 0;\\\">Comme demandé, vous trouverez ci-dessous l'inventaire de la volaille :</p></div> </td> </tr></table></th> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td class=\\\"r17-i\\\" style=\\\"background-color: #ffffff; padding-left: 20px; padding-right: 20px; padding-top: 15px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"8.33%\\\" valign=\\\"top\\\" class=\\\"r18-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"9\\\" align=\\\"center\\\" class=\\\"r19-o\\\" style=\\\"table-layout: fixed; width: 9px;\\\"><tr><td class=\\\"r20-i\\\" style=\\\"font-size: 0px; line-height: 0px; padding-top: 11px;\\\"> <img src=\\\"https://img.mailinblue.com/2670624/images/rnb/original/5f03261f9f4f23cb4662389c.png\\\" width=\\\"9\\\" border=\\\"0\\\" style=\\\"display: block; width: 100%;\\\"></td> </tr></table></th> <th width=\\\"91.67%\\\" valign=\\\"top\\\" class=\\\"r21-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r22-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; text-align: left;\\\"> <div><p style=\\\"margin: 0;\\\"><strong>Nombre de poulet,</strong>"+total_poulet+"</p></div> </td> </tr></table></th> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td class=\\\"r23-i\\\" style=\\\"background-color: #ffffff; padding-left: 20px; padding-right: 20px; padding-top: 10px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"8.33%\\\" valign=\\\"top\\\" class=\\\"r18-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"9\\\" align=\\\"center\\\" class=\\\"r19-o\\\" style=\\\"table-layout: fixed; width: 9px;\\\"><tr><td class=\\\"r20-i\\\" style=\\\"font-size: 0px; line-height: 0px; padding-top: 11px;\\\"> <img src=\\\"https://img.mailinblue.com/2670624/images/rnb/original/5f03261f9f4f23cb4662389c.png\\\" width=\\\"9\\\" border=\\\"0\\\" style=\\\"display: block; width: 100%;\\\"></td> </tr></table></th> <th width=\\\"91.67%\\\" valign=\\\"top\\\" class=\\\"r21-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r22-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; text-align: left;\\\"> <div><p style=\\\"margin: 0;\\\"><strong>Valeur du stock poulet,</strong>"+valeur_stock_poulet+"</p></div> </td> </tr></table></th> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td class=\\\"r23-i\\\" style=\\\"background-color: #ffffff; padding-left: 20px; padding-right: 20px; padding-top: 10px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"8.33%\\\" valign=\\\"top\\\" class=\\\"r18-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"9\\\" align=\\\"center\\\" class=\\\"r19-o\\\" style=\\\"table-layout: fixed; width: 9px;\\\"><tr><td class=\\\"r20-i\\\" style=\\\"font-size: 0px; line-height: 0px; padding-top: 11px;\\\"> <img src=\\\"https://img.mailinblue.com/2670624/images/rnb/original/5f03261f9f4f23cb4662389c.png\\\" width=\\\"9\\\" border=\\\"0\\\" style=\\\"display: block; width: 100%;\\\"></td> </tr></table></th> <th width=\\\"91.67%\\\" valign=\\\"top\\\" class=\\\"r21-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r22-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; text-align: left;\\\"> <div><p style=\\\"margin: 0;\\\"><strong>Nombre de canard,</strong>"+total_canard+"</p></div> </td> </tr></table></th> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td class=\\\"r23-i\\\" style=\\\"background-color: #ffffff; padding-left: 20px; padding-right: 20px; padding-top: 10px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"8.33%\\\" valign=\\\"top\\\" class=\\\"r18-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"9\\\" align=\\\"center\\\" class=\\\"r19-o\\\" style=\\\"table-layout: fixed; width: 9px;\\\"><tr><td class=\\\"r20-i\\\" style=\\\"font-size: 0px; line-height: 0px; padding-top: 11px;\\\"> <img src=\\\"https://img.mailinblue.com/2670624/images/rnb/original/5f03261f9f4f23cb4662389c.png\\\" width=\\\"9\\\" border=\\\"0\\\" style=\\\"display: block; width: 100%;\\\"></td> </tr></table></th> <th width=\\\"91.67%\\\" valign=\\\"top\\\" class=\\\"r21-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r22-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; text-align: left;\\\"> <div><p style=\\\"margin: 0;\\\"><strong>Valeur du stock canard,</strong>"+valeur_stock_canard+"</p></div> </td> </tr></table></th> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td class=\\\"r16-i\\\" style=\\\"background-color: #ffffff; padding-left: 20px; padding-right: 20px; padding-top: 25px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"100%\\\" valign=\\\"top\\\" class=\\\"r5-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r14-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; text-align: left;\\\"> <div><p style=\\\"margin: 0;\\\">Note : Il est inclus dans le calcul \\\"valeur du stock poulet/ canard\\\" <u>uniquement ceux qui ont dépassé le poids réglementaire</u>.</p></div> </td> </tr></table></th> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td class=\\\"r24-i\\\" style=\\\"background-color: #ffffff; padding-bottom: 25px; padding-left: 20px; padding-right: 20px; padding-top: 25px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"100%\\\" valign=\\\"top\\\" class=\\\"r5-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r14-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; text-align: left;\\\"> <div><p style=\\\"margin: 0;\\\">Cordialement,</p></div> </td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r25-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; padding-top: 15px; text-align: left;\\\"> <div><div class=\\\"sib_class_32_black_mrdafoe_reg\\\" style=\\\"color: #3e3e3e; font-family: Mr Dafoe,Helvetica,Arial,sans-serif; font-size: 32px; word-break: break-word;\\\">John Smith</div></div> </td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"left\\\" valign=\\\"top\\\" class=\\\"r26-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; padding-top: 11px; text-align: left;\\\"> <div><span>John Smith, <br>Chief Executive Officer</span></div> </td> </tr></table></th> </tr></table></td> </tr></table></td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"center\\\" class=\\\"r0-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td valign=\\\"top\\\" class=\\\"r8-i\\\" style=\\\"background-color: #082c4e;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"600\\\" align=\\\"center\\\" class=\\\"r3-o\\\" style=\\\"table-layout: fixed; width: 600px;\\\"><tr><td class=\\\"r27-i\\\" style=\\\"padding-bottom: 30px; padding-left: 20px; padding-right: 20px; padding-top: 25px;\\\"> <table width=\\\"100%\\\" cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\"><tr><th width=\\\"100%\\\" valign=\\\"top\\\" class=\\\"r5-c\\\" style=\\\"font-weight: normal;\\\"> <table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"center\\\" valign=\\\"top\\\" class=\\\"r28-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; padding-top: 30px; text-align: center;\\\"> <div><div class=\\\"sib_class_18_white_reg\\\" style=\\\"color: #fff; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 18px; word-break: break-word;\\\">-</div><div class=\\\"sib_class_18_white_reg\\\" style=\\\"color: #fff; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 18px; word-break: break-word;\\\">Somewhere in space, 00000 International Space Station<br><a href=\\\"http://\\\" style=\\\"color: #404f5e; text-decoration: none;\\\"><span style=\\\"color: #ffffff;\\\">contact@noreply.com</span></a></div></div> </td> </tr></table><table cellspacing=\\\"0\\\" cellpadding=\\\"0\\\" border=\\\"0\\\" role=\\\"presentation\\\" width=\\\"100%\\\" align=\\\"left\\\" class=\\\"r13-o\\\" style=\\\"table-layout: fixed; width: 100%;\\\"><tr><td align=\\\"center\\\" valign=\\\"top\\\" class=\\\"r28-i nl2go-default-textstyle\\\" style=\\\"color: #3e3e3e; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 20px; line-height: 1.45; word-break: break-word; padding-top: 30px; text-align: center;\\\"> <div><div class=\\\"sib_class_16_white_reg_u\\\" style=\\\"color: #fff; font-family: Montserrat,Helvetica,Arial,sans-serif; font-size: 16px; text-decoration: underline; word-break: break-word;\\\"><a href=\\\"{{ unsubscribe }}\\\" style=\\\"color: #404f5e; text-decoration: none;\\\"><span style=\\\"color: #ffffff;\\\"><u>Unsubscribe</u></span></a></div></div> </td> </tr></table></th> </tr></table></td> </tr></table></td> </tr></table></td> </tr></table></body></html>\"}");
        Request request = new Request.Builder()
                .url("https://api.brevo.com/v3/smtp/email")
                .post(body)
                .addHeader("accept", "application/json")
                .addHeader("content-type", "application/json")
                .addHeader("api-key", "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")
                .build();

        Response response = client.newCall(request).execute();
    }
}
