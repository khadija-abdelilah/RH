package com.dijachim.employeeservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private int age;
    private String genre;
    private String etatCivil;
    private String poste;
    private String departement;
    private int niveauEmploi;
    private int salaireMensuel;
    private int experienceTotale;
    private int yearsAtCompany;
    private int yearsInCurrentRole;
    private int yearsSinceLastPromotion;
    private int yearsWithCurrManager;
    private int environmentSatisfaction;
    private int jobSatisfaction;
    private int jobInvolvement;
    private int workLifeBalance;
    private String overTime;
    private String businessTravel;
    private int distanceFromHome;
    private int stockOptionLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEtatCivil() {
        return etatCivil;
    }

    public void setEtatCivil(String etatCivil) {
        this.etatCivil = etatCivil;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getNiveauEmploi() {
        return niveauEmploi;
    }

    public void setNiveauEmploi(int niveauEmploi) {
        this.niveauEmploi = niveauEmploi;
    }

    public int getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(int salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }

    public int getExperienceTotale() {
        return experienceTotale;
    }

    public void setExperienceTotale(int experienceTotale) {
        this.experienceTotale = experienceTotale;
    }

    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    public int getYearsInCurrentRole() {
        return yearsInCurrentRole;
    }

    public void setYearsInCurrentRole(int yearsInCurrentRole) {
        this.yearsInCurrentRole = yearsInCurrentRole;
    }

    public int getYearsSinceLastPromotion() {
        return yearsSinceLastPromotion;
    }

    public void setYearsSinceLastPromotion(int yearsSinceLastPromotion) {
        this.yearsSinceLastPromotion = yearsSinceLastPromotion;
    }

    public int getYearsWithCurrManager() {
        return yearsWithCurrManager;
    }

    public void setYearsWithCurrManager(int yearsWithCurrManager) {
        this.yearsWithCurrManager = yearsWithCurrManager;
    }

    public int getEnvironmentSatisfaction() {
        return environmentSatisfaction;
    }

    public void setEnvironmentSatisfaction(int environmentSatisfaction) {
        this.environmentSatisfaction = environmentSatisfaction;
    }

    public int getJobSatisfaction() {
        return jobSatisfaction;
    }

    public void setJobSatisfaction(int jobSatisfaction) {
        this.jobSatisfaction = jobSatisfaction;
    }

    public int getJobInvolvement() {
        return jobInvolvement;
    }

    public void setJobInvolvement(int jobInvolvement) {
        this.jobInvolvement = jobInvolvement;
    }

    public int getWorkLifeBalance() {
        return workLifeBalance;
    }

    public void setWorkLifeBalance(int workLifeBalance) {
        this.workLifeBalance = workLifeBalance;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }

    public String getBusinessTravel() {
        return businessTravel;
    }

    public void setBusinessTravel(String businessTravel) {
        this.businessTravel = businessTravel;
    }

    public int getDistanceFromHome() {
        return distanceFromHome;
    }

    public void setDistanceFromHome(int distanceFromHome) {
        this.distanceFromHome = distanceFromHome;
    }

    public int getStockOptionLevel() {
        return stockOptionLevel;
    }

    public void setStockOptionLevel(int stockOptionLevel) {
        this.stockOptionLevel = stockOptionLevel;
    }
}
