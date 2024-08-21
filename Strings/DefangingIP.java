package org.example.Strings;

import java.util.Arrays;

public class DefangingIP {
    public static String defangIPaddr(String address) {
        String[] str = address.split("\\.");
        System.out.println(Arrays.toString(str));
        StringBuilder st = new StringBuilder();
        st.append(str[0]);
        for(int i=1;i<str.length-1;i++){
            st.append("[.]").append(str[i]);
        }
        st.append("[.]").append(str[str.length-1]);
        return st.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("128.341.4541.4531"));
    }
}
