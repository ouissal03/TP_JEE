package dao;

import java.io.Serializable;
public class Adherent implements Serializable{
 private String email;
 private String nom;
 private String prenom;
 private String adresse;
 private String genre;
 private String tel;
 public Adherent() {
 }
 public void setEmail(String email) {
 this.email = email;
 }
 public void setNom(String nom) {
 this.nom = nom;
 }
 public void setPrenom(String prenom) {
 this.prenom = prenom;
 }
 public void setAdresse(String adresse) {
 this.adresse = adresse;
 }
 public void setGenre(String genre) {
 this.genre = genre;
 }
 public void setTel(String tel) {

 this.tel = tel;
 }
 public String getEmail() {
 return email;
 }
 public String getNom() {
 return nom;
 }
 public String getPrenom() {
 return prenom;
 }
 public String getAdresse() {
 return adresse;
 }
 public String getGenre() {
 return genre;
 }
 public String getTel() {
 return tel;
 }
 
 @Override
 public String toString(){
 return "Adherent[email : " + email + ", Nom : " + nom + ", Prenom : " + prenom +"]";
 }
 }