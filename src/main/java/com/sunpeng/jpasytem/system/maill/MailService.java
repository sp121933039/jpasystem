package com.sunpeng.jpasytem.system.maill;

public interface MailService {


    void sendSimpleMail(String to, String subject, String content);
}
