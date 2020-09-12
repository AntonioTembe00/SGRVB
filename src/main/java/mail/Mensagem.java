/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class Mensagem {
    private String remetente;
    private String destinatario;
    private String assunto;
    private String corpo;

    public Mensagem(String remetente, String destinatario, String assunto, String corpo) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
    }

    public Mensagem() {
    }

    /**
     * @return the remetente
     */
    public String getRemetente() {
        return remetente;
    }

    /**
     * @param remetente the remetente to set
     */
    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    /**
     * @return the destinatarios
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatarios the destinatarios to set
     */
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    /**
     * @return the corpo
     */
    public String getCorpo() {
        return corpo;
    }

    /**
     * @param corpo the corpo to set
     */
    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }
    
    
    
}
