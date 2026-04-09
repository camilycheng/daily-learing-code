package com.cn.cly.test;

import cn.hutool.core.text.StrBuilder;

public class MethodTest {
    public static void main(String[] args) {
        System.out.println(toSymbolCase("helloWorld", '-'));      // 期望: "hello"
        System.out.println(toSymbolCase("Hello", '-'));      // 输出: "hello"
        System.out.println(toSymbolCase("HelloWorld", '-')); // 输出: "hello-world"
        System.out.println(toSymbolCase("XMLHttp", '-'));    // 输出: "xml-http"
        System.out.println(toSymbolCase("camelCase", '-'));  // 输出: "camel-case"
        System.out.println(toSymbolCase("Test123", '-'));    // 输出: "test-123"

    }

    public static String toSymbolCase(CharSequence str, char symbol) {
        if (str == null) {
            return null;
        } else {
            int length = str.length();
            StrBuilder sb = new StrBuilder();

            for(int i = 0; i < length; ++i) {
                char c = str.charAt(i);
                Character preChar = i > 0 ? str.charAt(i - 1) : null;
                if (Character.isUpperCase(c)) {
                    Character nextChar = i < str.length() - 1 ? str.charAt(i + 1) : null;
                    if (null != preChar && Character.isUpperCase(preChar)) {
                        sb.append(c);
                    } else if (null != nextChar && !Character.isLowerCase(nextChar)) {
                        if (null != preChar && symbol != preChar) {
                            sb.append(symbol);
                        }

                        sb.append(c);
                    } else {
                        if (null != preChar && symbol != preChar) {
                            sb.append(symbol);
                        }

                        sb.append(Character.toLowerCase(c));
                    }
                } else {
                    if (symbol != c && sb.length() > 0 && Character.isUpperCase(sb.charAt(-1)) && Character.isLowerCase(c)) {
                        sb.append(symbol);
                    }

                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }

}
