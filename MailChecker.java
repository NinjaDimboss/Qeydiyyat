package com.cyber.Proektimiz;

import com.cyber.Proektimiz.InvalidMailFormatException;

public class MailChecker {
    private final String mail;
    public MailChecker(String mail){
        this.mail = mail;
    }

    public void check() throws InvalidMailFormatException {
        if(!this.mail.contains("@cybernet.az")){
            throw new InvalidMailFormatException("Mail formatınız düzgün deyil. Zəhmət olmasa '@cybernet.az' domaini ilə qeydiyyatdan keçin!");
        }
    }
}
