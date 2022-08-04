package Data_structure;

public class Bill_Max_Min {
    public static void main(String[] args) {
        float[][] electricity_attribute=new float[3][6];
        float[] bill=new float[6];
        for(int i=0;i<3;i++)
        {
            if(i==0)
            {
                for(int j=0;j<6;j++)
                {
                    electricity_attribute[i][j]=(float) Math.random()*200;
                }
            }else if(i==1)
            {
                for(int j=0;j<6;j++)
                {
                    electricity_attribute[i][j]=(float) Math.random()*10;
                }
            }else
            {
                for(int j=0;j<6;j++)
                {
                    electricity_attribute[i][j]=Math.round(Math.random()*1);
                }
            }
           
        }
        System.out.println("Details of Energy consumption 6 consumer");
        System.out.println("Details of 6 consumer\nCon_No. Energy\t\tLoad\t\tUrban Or Rural\n ");
        for(int i=0;i<6;i++)
        {
                System.out.print(i+1);
                for(int j=0;j<3;j++)
                {
                    System.out.print("\t"+electricity_attribute[j][i]);
                }
            
            System.out.println();
        }

       int k=0;
            for(int j=0;j<6;j++)
            {
                if(electricity_attribute[2][j]==0.0){
                    bill[k]=(electricity_attribute[0][j]*5)+(electricity_attribute[1][j]*110);
                    k++;
                }else
                {
                    bill[k]=(electricity_attribute[0][j]*7)+(electricity_attribute[1][j]*130);
                    k++;
                }
                    
            }
            float max_val=bill[0],min_val=bill[0];
            int index_max=0,index_min=0;
           System.out.println();

        for(int i=0;i<6;i++)
        {
            if(bill[i]>max_val)
            {
                max_val=bill[i];
                index_max=i;
            }else if(bill[i]<min_val)
            {
                min_val=bill[i];
                index_min=i;
            }
            System.out.println("Consumer No."+(i+1)+" bill value: "+bill[i]);
       
        }
       
        System.out.println("\nHurray ! Consumer No Awarded for Max Bill is: "+(index_max+1)+" "+"\nHurray ! Consumer No Awarded for Min Bill is: "+(index_min+1));
       
    }
}

