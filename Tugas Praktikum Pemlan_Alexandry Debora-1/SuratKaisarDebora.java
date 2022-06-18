/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak1Debora;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class SuratKaisarDebora {
    public static void main(String[] args) {
        String in;
        String out = "";
        int jumlah;
        char ch;
        
        Scanner scan = new Scanner(System.in);
        in = scan.nextLine();
        jumlah = scan.nextInt();
        
        for(int i = 0; i < in.length(); ++i){
            ch = in.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + jumlah);
                
                if(ch >= 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }
                out += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + jumlah);
                
                 if(ch > 'Z'){
                ch = (char)(ch - 'Z' + 'A' - 1);
            }
            
            out += ch;
        }
        else {
         out += ch;
        }
}
    System.out.println(out);
    }
}

