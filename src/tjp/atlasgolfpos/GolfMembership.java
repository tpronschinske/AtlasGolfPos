/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tjp.atlasgolfpos;

/**
 *
 * @author Travis
 */
public class GolfMembership implements MembershipType {
    
    private Double singleAnnualFees = 3255.00;
    private Double coupleAnnualFees = 6100.00;
    private Double familyAnnualFees = 7800.00;
    private Double studentAnnualFees = 1800.00;
    private Double monthlyFees = 42.50;
    private String membershipType;

    public Double getSingleAnnualFees() {
        return singleAnnualFees;
    }

    public void setSingleAnnualFees(Double singleAnnualFees) {
        this.singleAnnualFees = singleAnnualFees;
    }

    public Double getCoupleAnnualFees() {
        return coupleAnnualFees;
    }

    public void setCoupleAnnualFees(Double coupleAnnualFees) {
        this.coupleAnnualFees = coupleAnnualFees;
    }

    public Double getFamilyAnnualFees() {
        return familyAnnualFees;
    }

    public void setFamilyAnnualFees(Double familyAnnualFees) {
        this.familyAnnualFees = familyAnnualFees;
    }

    public Double getMonthlyFees() {
        return monthlyFees;
    }

    public void setMonthlyFees(Double monthlyFees) {
        this.monthlyFees = monthlyFees;
    }

    public Double getStudentAnnualFees() {
        return studentAnnualFees;
    }

    public void setStudentAnnualFees(Double studentAnnualFees) {
        this.studentAnnualFees = studentAnnualFees;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String membershipType(String membershipType) {
       return membershipType; 
    }
    
    
    
    
}
