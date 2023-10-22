package me.dio.santanderdevweek2023.domain.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_resident")
public class Resident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Apartment apartment;

    private String ideasForCondominium;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Apartment getApartment() {
            return apartment;
        }

        public void setApartment(Apartment apartment) {
            this.apartment = apartment;
        }

        public String getIdeasForCondominium() {
            return ideasForCondominium;
        }

        public void setIdeasForCondominium(String ideasForCondominium) {
            this.ideasForCondominium = ideasForCondominium;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        } 
        
        
    }