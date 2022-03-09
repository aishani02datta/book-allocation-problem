/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
    private boolean allocationPossible(ArrayList<Integer>A,int barrier,int count){
        int allocated_stud=0;
        int pages=0;
        for(int i=0;i<A.size();i++){
        if(A.get(i)>barrier)
        return false;
        if(A.get(i)+pages>barrier){
            allocated_stud+=1;
            pages+=A.get(i);
        }
        else{
            pages+=A.get(i);
        }
        }
    if(allocated_stud>count)return false;
    return true;
    }
public static void main(String[] args) {
	    ArrayList<Integer>A=new ArrayList<Integer>();
	    int B;
	    if(B>A.size())
	        return -1;
	   int low=A.get(0);
	   int high=0;
	   for(int i=0;i<A.size();i++){
	       high+=A.get(i);
	       low=Math.min(low,A.get(i));
	   }
	   int ans=-1;
		while(low<=high){
		    int mid=(low+high)/2;
		    if(allocationPossible(A,mid,B)){
		        ans=mid;
		        high=mid-1;
		    }
		    else{
		        low=mid+1;
		    }
		}
		return ans;
	}
}
