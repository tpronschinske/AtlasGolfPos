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
public class PoolMembership implements MembershipType {
    
     private Double annualFees = 199.99;
     private Double monthlyFees = 12.99;
     private String membershipType = "Pool Membership";

    public Double getAnnualFees() {
        return annualFees;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
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
