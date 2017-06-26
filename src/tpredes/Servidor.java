/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpredes;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Note
 */
public class Servidor {

    public static void main(String args[]) {
        
        int port = 12345;
        int pontostJogador1 = 0;
        int pontostJogador2 = 0;
        
        boolean startGame = false;
        
        try(ServerSocket server = new ServerSocket(port)) {
            System.out.println("Servidor iniciado na porta " + port);
            Socket cliente = server.accept();
            
            InputStream in = cliente.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            
            OutputStream out = cliente.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            dos.writeUTF("AGUARDE CONEXÃO DE OUTRO CLIENTE");
            
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}