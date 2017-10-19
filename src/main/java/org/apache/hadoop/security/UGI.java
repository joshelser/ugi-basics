package org.apache.hadoop.security;

import javax.security.auth.Subject;
import javax.security.auth.kerberos.KeyTab;

import org.apache.hadoop.security.UserGroupInformation;


public class UGI {
  public static void main(String[] args) throws Exception {
    UserGroupInformation.loginUserFromKeytab("<INSERT PRINCIPAL>", "<INSERT_KEYTAB>");
    UserGroupInformation user1login = UserGroupInformation.getLoginUser();
    System.out.println(user1login.isFromKeytab());
    Subject subject = user1login.getSubject();
    System.out.println(subject);
    System.out.println(subject.getPrivateCredentials(KeyTab.class));
  }
}
