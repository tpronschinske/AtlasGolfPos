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
public class TennisMembership implements MembershipType {
    
     private Double annualFees = 2999.99;
     private Double courtFees = 1.99;
     private String membershipType = "Tennis Membership";

    public TennisMembership() {
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

    public Double getCourtFees() {
        return courtFees;
    }

    public void setCourtFees(Double courtFees) {
        this.courtFees = courtFees;
    }

    @Override
    public String membershipType(String membershipType) {
      return membershipType;
    }
     
     
    
}
