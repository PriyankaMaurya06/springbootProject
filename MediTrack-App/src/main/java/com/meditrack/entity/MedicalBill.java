package com.meditrack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedicalBill {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String mob;
        private String email;
        private double medicine_charge;
        private double dr_charge;
        private double lab_charge;
        private double cleaning_charge;
        private double bed_charge;
        private double total_charge;
    public void setMedicine_charge(double medicine_charge) {
        this.dr_charge = dr_charge;
        calculateTotalCharge();
    }
        public void setDr_charge(double dr_charge) {
            this.dr_charge = dr_charge;
            calculateTotalCharge();
        }

        public void setLab_charge(double lab_charge) {
            this.lab_charge = lab_charge;
            calculateTotalCharge();
        }

        public void setCleaning_charge(double cleaning_charge) {
            this.cleaning_charge = cleaning_charge;
            calculateTotalCharge();
        }

        public void setBed_charge(double bed_charge) {
            this.bed_charge = bed_charge;
            calculateTotalCharge();
        }

        private void calculateTotalCharge() {
            this.total_charge = +this.medicine_charge+this.dr_charge + this.lab_charge + this.cleaning_charge + this.bed_charge;
}
}
