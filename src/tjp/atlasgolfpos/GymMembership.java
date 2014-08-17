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
public class GymMembership implements MembershipType {
    
    private Double annualFees = 89.99;
    private Double monthlyFees = 19.99;
    private String membershipType = "Gym Membership";

    public GymMembership() {
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    
    public Double getAnnualFees() {
        return annualFees;
    }

    public void setAnnualFees(Double annualFees) {
        this.annualFees = annualFees;
    }

    public Double getMonthlyFees() {
        return monthlyFees;
    }

    public void setMonthlyFees(Double monthlyFees) {
        this.monthlyFees = monthlyFees;
    }

    @Override
    public String membershipType(String membershipType) {
        return membershipType;
    }
    
    
    
  

    
}
