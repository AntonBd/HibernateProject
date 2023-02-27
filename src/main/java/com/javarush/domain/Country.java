package com.javarush.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(schema = "world_2", name="country")
public class Country {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name="code")
    private String code;

    @Column(name = "code_2")
    private String alternativeCode;

    @Column(name="name")
    private String name;

    @Column(name="continent")
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;

    @Column(name="region")
    private String region;

    @Column(name="surface_area")
    private BigDecimal surfaceArea;

    @Column(name="indep_year")
    private Short indepYear;

    @Column(name="population")
    private Integer population;

    @Column(name="life_expectancy")
    private BigDecimal lifeExpectancy;

    @Column(name="gnp")
    private BigDecimal GNP;

    @Column(name="gnpo_id")
    private BigDecimal GNPOId;

    @Column(name="local_name")
    private String localName;

    @Column(name="government_form")
    private String governmentForm;

    @Column(name="head_of_state")
    private String headState;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="capital")
    private City city;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="country_id")
    private Set<CountryLanguage> languages;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<CountryLanguage> languages) {
        this.languages = languages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAlternativeCode() {
        return alternativeCode;
    }

    public void setAlternativeCode(String alternativeCode) {
        this.alternativeCode = alternativeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Short indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGNP() {
        return GNP;
    }

    public void setGNP(BigDecimal GNP) {
        this.GNP = GNP;
    }

    public BigDecimal getGNPOId() {
        return GNPOId;
    }

    public void setGNPOId(BigDecimal GNPOId) {
        this.GNPOId = GNPOId;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadState() {
        return headState;
    }

    public void setHeadState(String headState) {
        this.headState = headState;
    }
}
