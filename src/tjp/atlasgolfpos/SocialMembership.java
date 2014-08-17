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
public class SocialMembership implements MembershipType {
    
     private Double annualFees = 299.99;
     private String membershipType = "Social Membership";

    public SocialMembership() {
        
    }
     
    public Double getAnnualFees() {
        return annualFees;
    }

    public final String getMembershipType() {
        return membershipType;
    }

    public final void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
    

    public void setAnnualFees(Double annualFees) {
        this.annualFees = annualFees;
    }

    @Override
    public String membershipType(String membershipType) {
         return membershipType;
    }
   
     
     
    
}
