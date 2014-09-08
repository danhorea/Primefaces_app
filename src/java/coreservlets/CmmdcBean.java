package coreservlets;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="CmmdcBean")
public class CmmdcBean {
	  private long m=1;
	  private long n=1;
	 
	  public long getM() {
		return m;
	}
	public void setM(long m) {
		this.m = m;
	}
	public long getN() {
		return n;
	}
	public void setN(long n) {
		this.n = n;
	}
	public String getZZZ(){
		return  "Cmmdc: " + cmmdc(getM(),getN());		
	}
	private long cmmdc(long m,long n){
	    long r,c;
	    do{
	      c=n;
	    r=m%n;
	    m=n;
	    n=r;
	    }
	    while(r!=0);
	    return c;
	  }
	}
