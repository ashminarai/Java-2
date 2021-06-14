import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.util.ArrayList;

/**
 * Write a description of class INGNepal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Here, we create a class named as an INGNepal where we store different components//
public class INGNepal{
    private ArrayList <StaffHire> Sh =new ArrayList<StaffHire>();
    private JFrame frame;
    private JMenuBar mb;
    private JMenu mn1,mn2;
    private JMenuItem miNew,miExit,miDeveloper,miVersion;
    private JPanel mainPanel,fullTimeStaffHirePanel,partTimeStaffHirePanel;
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22;
    private JTextField txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txt17,txt18,txt19,txt20,txt21,txt22;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13;

    public INGNepal(){
        initializeFrame();
        initializeMenu();
        initializeMainPanel();
        initializeFullTimeStaffHirePanel();
        initializePartTimeStaffHirePanel();

    }
    //Here, we initialize a method as frame//
    public void initializeFrame(){
        frame= new JFrame("INGNepal");
        frame.setSize(1000,850);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    //Here, we initialize a method as Menu//
    public void initializeMenu(){
        mb=new JMenuBar();
        frame.setJMenuBar(mb);

        mn1=new JMenu("File");
        mb.add(mn1);

        mn2=new JMenu("About");
        mb.add(mn2);

        miNew=new JMenuItem("New");
        miNew.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    mainPanel.setVisible(true);
                    fullTimeStaffHirePanel.setVisible(false);
                    partTimeStaffHirePanel.setVisible(false);
                    fullTimeStaffHireClear();
                    partTimeStaffHireClear();
                }
            });
        mn1.add(miNew);

        miExit=new JMenuItem("Exit");
        miExit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    System.exit(0);
                }
            });
        mn2.add(miExit);

        miDeveloper=new JMenuItem("Developer");
        miDeveloper.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(frame, "This GUI is developed by Ashmina Rai,student of IIC");
                }
            });
        mn2.add(miDeveloper);

        miVersion=new JMenuItem("Version");
        miVersion.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(frame,"version 1.1.1","version", JOptionPane.INFORMATION_MESSAGE);
                }
            });
        mn1.add(miVersion);
    }
    //Here, we initialize a method as mainPanel//
    public void initializeMainPanel(){
        mainPanel=new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0,0,1000,850);

        JLabel label1=new JLabel("GUI");
        label1.setBounds(310,325,70,25);
        mainPanel.add(label1);

        JButton btn1=new JButton("FullTimeStaffHire");
        btn1.setBounds(350,280,150,45);
        btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    mainPanel.setVisible(false);
                    fullTimeStaffHirePanel.setVisible(true);
                }
            });
        mainPanel.add(btn1);

        JButton btn2=new JButton("PartTimeStaffHire");

        btn2.setBounds(350,350,150,45);
        btn2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    mainPanel.setVisible(false);
                    partTimeStaffHirePanel.setVisible(true);
                }
            });
        mainPanel.add(btn2);

        mainPanel.setVisible(true);
        frame.add(mainPanel);
    }
    //Here, we initialize a method as fullTimeStaffHirePanel//
    public void initializeFullTimeStaffHirePanel(){
        fullTimeStaffHirePanel= new JPanel();
        fullTimeStaffHirePanel.setLayout(null);
        fullTimeStaffHirePanel.setBounds(0,0,1000,850);

        //Here, we create JLabel for fullTimeStaffHire, set bounds 280px along x-axis, 10px along y-axis, 150 as length and 45 as breadth and add it to fullTimeStaffHirePanel//
        label2=new JLabel(" For Full Time Staff Hire");
        label2.setBounds(280,10,150,45);
        fullTimeStaffHirePanel.add(label2);

        label3=new JLabel("Vacancy Number: ");
        label3.setBounds(20,50,200,45);
        fullTimeStaffHirePanel.add(label3);
        //Here we create JTextField as txt3, set their bounds and add it to partTimeStaffHirePanel//
        txt3=new JTextField();
        txt3.setBounds(150,60,150,25);
        fullTimeStaffHirePanel.add(txt3);

        label4=new JLabel("Designation: ");
        label4.setBounds(20,90,200,45);
        fullTimeStaffHirePanel.add(label4);
        txt4=new JTextField();
        txt4.setBounds(150,100,150,25);
        fullTimeStaffHirePanel.add(txt4);

        label5=new JLabel("Job Type: ");
        label5.setBounds(20,130,200,45);
        fullTimeStaffHirePanel.add(label5);
        txt5=new JTextField();
        txt5.setBounds(150,140,150,25);
        fullTimeStaffHirePanel.add(txt5);

        label6=new JLabel("Salary: ");
        label6.setBounds(20,170,200,45);
        fullTimeStaffHirePanel.add(label6);
        txt6=new JTextField();
        txt6.setBounds(150,180,150,25);
        fullTimeStaffHirePanel.add(txt6);

        label7=new JLabel("Working Hour: ");
        label7.setBounds(20,210,200,45);
        fullTimeStaffHirePanel.add(label7);
        txt7=new JTextField();
        txt7.setBounds(150,220,150,25);
        fullTimeStaffHirePanel.add(txt7);

        //Here, we create new JButton as btn3 and store value Add Vacancy//
        btn3=new JButton("Add Vacancy");
        //Here we set the bound of btn3 as 20px along x-axis, 300px along y-axis, 150 as length and 25 as breadth//
        btn3.setBounds(20,300,150,25);
        //Here we use event handling case for btn3 and later add to fullTimeStaffHirePanel//
        btn3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fullTimeStaffHireAddVacancy();
                }});
        fullTimeStaffHirePanel.add(btn3);

        label8=new JLabel("Joining Date: ");
        label8.setBounds(450,50,100,45);
        fullTimeStaffHirePanel.add(label8);
        txt8=new JTextField();
        txt8.setBounds(550,60,150,25);
        fullTimeStaffHirePanel.add(txt8);

        label9=new JLabel("Staff Name: ");
        label9.setBounds(450,90,100,45);
        fullTimeStaffHirePanel.add(label9);
        txt9=new JTextField();
        txt9.setBounds(550,100,150,25);
        fullTimeStaffHirePanel.add(txt9);

        label10=new JLabel("Qualification: ");
        label10.setBounds(450,130,100,45);
        fullTimeStaffHirePanel.add(label10);
        txt10=new JTextField();
        txt10.setBounds(550,140,150,25);
        fullTimeStaffHirePanel.add(txt10);

        label11=new JLabel("Appointed By: ");
        label11.setBounds(450,170,100,45);
        fullTimeStaffHirePanel.add(label11);
        txt11=new JTextField();
        txt11.setBounds(550,180,150,25);
        fullTimeStaffHirePanel.add(txt11);

        //Here, we create a new JButton as btn4 and store value Appoint//
        btn4=new JButton("Appoint");
        //Here, we set the bounds of btn4 as 240px along x-axis, 300px along y-axis, 150 as length and 25 as breadth and add it to fullTimeStaffHirePanel//
        btn4.setBounds(240,300,150,25);
        fullTimeStaffHirePanel.add(btn4);
        //Here, we use event handling case for btn4 and later added btn4 to fullTimeStaffHirePanel//
        btn4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fullTimeAppoint();
                }
            });
        fullTimeStaffHirePanel.add(btn4);

        //Here, we create a new JButton as btn5 and store value Clear//
        btn5=new JButton("Clear");
        //Here, we set the bounds of btn5 as 440px along x-axis, 300px along y-axis, 150 as length and 25 as breadth and add it to fullTimeStaffHirePanel//
        btn5.setBounds(440,300,150,25);
        fullTimeStaffHirePanel.add(btn5);
        //Here, we use event handling case for btn5 and later added btn5 to fullTimeStaffHirePanel//
        btn5.addActionListener(new  ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fullTimeStaffHireClear();
                }});
        fullTimeStaffHirePanel.add(btn5);

        //Here, we create a new JButton as btn6 and store value Display//
        btn6=new JButton("Display");
        //Here, we set the bounds of btn6 as 640px along x-axis, 300px along y-axis, 150 as length and 25 as breadth and add it to fullTimeStaffHirePanel//
        btn6.setBounds(640,300,150,25);
        //Here, we use event handling case for btn6 and later added btn6 to fullTimeStaffHirePanel//
        btn6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    fullTimeStaffHireDisplay();
                }});
        fullTimeStaffHirePanel.add(btn6);

        //Here, we create a new JButton as btn7 and store value Previous//
        btn7 = new JButton("Previous");
        //Here, we set the bounds of btn6 as 363px along x-axis, 370px along y-axis, 100 as length and 25 as breadth and add it to fullTimeStaffHirePanel//
        btn7.setBounds(363, 370, 100, 25);
        //Here, we use event handling case for btn7 where visibility of mainPanel and fullTimeStaffHire is set as true and false respectively and later added btn7 to fullTimeStaffHirePanel//
        btn7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    mainPanel.setVisible(true);
                    fullTimeStaffHirePanel.setVisible(false);
                }
            });
        fullTimeStaffHirePanel.add(btn7);

        //Here, we set the visibility of fullTimeStaffHirePanel as false and added later fullTimeStaffHire to frame//
        fullTimeStaffHirePanel.setVisible(false);
        frame.add(fullTimeStaffHirePanel);
    }

    //Here call a method as fullTimeStaffHireClear//
    public void fullTimeStaffHireClear(){
        int x = JOptionPane.showConfirmDialog(frame, "Are you sure, you want to clear the informations of fullTime", "info", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION){
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            txt6.setText("");
            txt7.setText("");
            txt8.setText("");
            txt9.setText("");
            txt10.setText("");
            txt11.setText("");
            JOptionPane.showMessageDialog(frame, "Cleared", "info", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        }
    }

    //Here call a method as fullTimeStaffHireDisplay//
    public void fullTimeStaffHireDisplay(){
        for(StaffHire staff: Sh){
            if(staff instanceof FullTimeStaffHire){
                FullTimeStaffHire staffs =(FullTimeStaffHire)staff;
                staffs.display();
            }
        }
    }

    //Here call a method as fullTimeStaffHireAddVacancy//
    public void fullTimeStaffHireAddVacancy(){
        String label3=txt3.getText().trim();
        String label4=txt4.getText().trim();
        String label5=txt5.getText().trim();
        String label6=txt6.getText().trim();
        String label7=txt7.getText().trim();
        int lbl3VacancyNumber=0;
        int lbl6Salary=0;
        int lbl7WorkingHour=0; 

        if (label3.equals("") || label4.equals("") || label5.equals("") || label6.equals("") 
        || label7.equals("")){
            JOptionPane.showMessageDialog(frame, "please fill all the information in the Text feilds", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            try{
                lbl3VacancyNumber=Integer.parseInt(label3);
                lbl6Salary= Integer.parseInt(label6);
                lbl7WorkingHour= Integer.parseInt(label7);
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(frame,"Enter Data in correct format","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            for(StaffHire staff : Sh){
                if(staff instanceof FullTimeStaffHire){
                    FullTimeStaffHire myStaff = (FullTimeStaffHire) staff;
                    if(staff.getVacancyNumber()==lbl3VacancyNumber){
                        JOptionPane.showMessageDialog(frame,"Invalid. Enter new vacancy Number","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
            FullTimeStaffHire fullTimeStaff= new FullTimeStaffHire(lbl3VacancyNumber,label4,label5,lbl6Salary,lbl7WorkingHour);
            Sh.add(fullTimeStaff);
            String fullTimeStaffHirePanelVacancyDetails = 
                "Vacancy Number: "+ label3 +
                "\n Designation: " + label4 +
                "\n Job Type: " + label5 +
                "\n Salary: " + label6 +
                "\n Working Hour: " + label7;
            JOptionPane.showMessageDialog(frame, fullTimeStaffHirePanelVacancyDetails, "Vacancy Added", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //Here call a method as fullTimeAppoint//
    public void fullTimeAppoint(){
        String label3=txt3.getText().trim();
        String label8=txt8.getText().trim();
        String label9=txt9.getText().trim();
        String label10=txt10.getText().trim();
        String label11=txt11.getText().trim();
        int lbl3VacancyNumber=0;

        if(label3.equals("") || label8.equals("") || label9.equals("") || label10.equals("") ||
        label11.equals("")){
            JOptionPane.showMessageDialog(frame, "please fill all the information in the Text feilds", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
            try{
                lbl3VacancyNumber=Integer.parseInt(label3);   
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(frame,"Enter Data in correct format","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        boolean found = false;
        for(StaffHire staff: Sh){
            if(staff instanceof FullTimeStaffHire){
                FullTimeStaffHire staffs = (FullTimeStaffHire)staff;
                if(staffs.getVacancyNumber()==lbl3VacancyNumber){
                    found = true;
                    if(staffs.getJoined()==false){
                        String fullTimeStaffHireDetails = 
                            "Staff Name: "+ label9 +
                            "\n Joining Date: " + label8 +
                            "\n Qualification: " + label10 +
                            "\n Appointed By: " + label11;
                        JOptionPane.showMessageDialog(frame,fullTimeStaffHireDetails,"Successfully Appointed",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(frame,"Staff already appointed");

                    }
                    staffs.FullTimeStaffHire(label9,label8,label10,label11);
                    return;
                }
            }
        }
        if(found==false){
            JOptionPane.showMessageDialog(frame,"Invalid. Enter new Vacancy Number");
        }
    }

    //Here call a method as partTimeStaffHirePanel//
    public void initializePartTimeStaffHirePanel(){
        partTimeStaffHirePanel= new JPanel();
        partTimeStaffHirePanel.setLayout(null);
        partTimeStaffHirePanel.setBounds(0,0,1000,850);

        //Here, we create new JLabel as label12 and set bound as 280px along x-axis,10px along y-axis,150 as length and 45 as breadth and add it to label12//
        label12=new JLabel("For Part Time Staff Hire");
        label12.setBounds(280,10,150,45);
        partTimeStaffHirePanel.add(label12);

        label13=new JLabel("vacancy Number: ");
        label13.setBounds(20,50,200,45);
        partTimeStaffHirePanel.add(label13);
        //Here, we create new JTextField as txt13 and set bounds as 170px along x-axis,60px along y-axis, 15opx as length and 25 as breadth and later added txt13 to partTimeStaffHirePanel//
        txt13=new JTextField();
        txt13.setBounds(170,60,150,25);
        partTimeStaffHirePanel.add(txt13); 

        label14=new JLabel("Designation: ");
        label14.setBounds(20,90,200,45);
        partTimeStaffHirePanel.add(label14);
        txt14=new JTextField();
        txt14.setBounds(170,100,150,25);
        partTimeStaffHirePanel.add(txt14); 

        label15=new JLabel("Job Type: ");
        label15.setBounds(20,130,200,45);
        partTimeStaffHirePanel.add(label15);
        txt15=new JTextField();
        txt15.setBounds(170,140,150,25);
        partTimeStaffHirePanel.add(txt15);

        label16=new JLabel("Working Hour Per Day: ");
        label16.setBounds(20,170,200,45);
        partTimeStaffHirePanel.add(label16);
        txt16=new JTextField();
        txt16.setBounds(170,180,150,25);
        partTimeStaffHirePanel.add(txt16);

        label17=new JLabel("Wages Per Hour: ");
        label17.setBounds(20,210,200,45);
        partTimeStaffHirePanel.add(label17);
        txt17=new JTextField();
        txt17.setBounds(170,220,150,25);
        partTimeStaffHirePanel.add(txt17);

        label18=new JLabel("Shift: ");
        label18.setBounds(20,250,200,45);
        partTimeStaffHirePanel.add(label18);
        txt18=new JTextField();
        txt18.setBounds(170,260,150,25);
        partTimeStaffHirePanel.add(txt18);

        //Here, we create a new JButton as btn8 and store value as Add Vacancy//
        btn8=new JButton("Add Vacancy");
        //Here,we set bound the btn8 as 40px along x-axis, 320px along y-axis,180 as length and 25as breadth and added to partTimeStaffHirePanel//
        btn8.setBounds(40,320,180,25);
        partTimeStaffHirePanel.add(btn8);
        //Here, we use event handling case for btn8 which is later added to partTimeStaffHirePanel//
        btn8.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    partTimeStaffHireAddVacancy();
                }});
        partTimeStaffHirePanel.add(btn8);

        //Here, we create a new JButton as btn9 and store value as Staff Name//
        label19=new JLabel("Staff Name: ");
        //Here,we set bound the btn9 as 450px along x-axis, 50px along y-axis,100 as length and 45as breadth and added to partTimeStaffHirePanel//
        label19.setBounds(450,50,100,45);
        partTimeStaffHirePanel.add(label19);
        txt19=new JTextField();
        txt19.setBounds(550,60,150,25);
        partTimeStaffHirePanel.add(txt19);

        label20=new JLabel("Joining Date: ");
        label20.setBounds(450,90,100,45);
        partTimeStaffHirePanel.add(label20);
        txt20=new JTextField();
        txt20.setBounds(550,100,150,25);
        partTimeStaffHirePanel.add(txt20);

        label21=new JLabel("Qualification: ");
        label21.setBounds(450,130,100,45);
        partTimeStaffHirePanel.add(label21);
        txt21=new JTextField();
        txt21.setBounds(550,140,150,25);
        partTimeStaffHirePanel.add(txt21);

        label22=new JLabel("Appointed By: ");
        label22.setBounds(450,170,100,45);
        partTimeStaffHirePanel.add(label22);
        txt22=new JTextField();
        txt22.setBounds(550,180,150,25);
        partTimeStaffHirePanel.add(txt22);

        btn9=new JButton("Appoint");
        btn9.setBounds(310,320,180,25);
        partTimeStaffHirePanel.add(btn9);
        btn9.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    partTimeAppoint();
                }
            });
        partTimeStaffHirePanel.add(btn9);

        btn10=new JButton("Terminate");
        btn10.setBounds(560,320,180,25);
        partTimeStaffHirePanel.add(btn10);
        btn10.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String vacancyNumber=JOptionPane.showInputDialog(frame,"Vacancy Number: ");;
                    try{
                        if(vacancyNumber.trim().equals(null));
                    }catch(NullPointerException e){
                        return;
                    }
                    int number=0;
                    if(!vacancyNumber.trim().equals("")){
                        try{
                            number= Integer.parseInt(vacancyNumber.trim());
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(frame,"Enter Data in correct format","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        boolean found=false;
                        for(StaffHire staff : Sh){
                            if(staff instanceof PartTimeStaffHire){
                                PartTimeStaffHire staffs = (PartTimeStaffHire) staff;
                                if(staffs.getVacancyNumber()== number){
                                    staffs.terminated();
                                    Sh.remove(staffs);
                                    found=true;
                                    JOptionPane.showMessageDialog(frame,"Staff Terminated.","error",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                        } 
                        if(!found){
                            JOptionPane.showMessageDialog(frame,"Invalid. Enter new Vacancy Number","Error",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else{    
                        JOptionPane.showMessageDialog(frame,"Invalid. Field Empty","Error",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            });

        btn11=new JButton("Display");
        btn11.setBounds(250,370,140,25);
        partTimeStaffHirePanel.add(btn11);
        btn11.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    partTimeStaffHireDisplay();

                }});
        partTimeStaffHirePanel.add(btn11);

        btn12=new JButton("Clear");
        btn12.setBounds(400,370,140,25);
        partTimeStaffHirePanel.add(btn12);
        btn12.addActionListener(new  ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    partTimeStaffHireClear();
                }});
        partTimeStaffHirePanel.add(btn12);

        btn13 = new JButton("Previous");
        btn13.setBounds(345, 420, 100, 25);
        btn13.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    mainPanel.setVisible(true);
                    partTimeStaffHirePanel.setVisible(false);
                }
            });
        partTimeStaffHirePanel.add(btn13);

        partTimeStaffHirePanel.setVisible(false);
        frame.add(partTimeStaffHirePanel);
    }
    //Here, we call a method as partTimeStaffHireAddVacancy//
    public void partTimeStaffHireAddVacancy(){
        String label13=txt13.getText().trim();
        String label14=txt14.getText().trim();
        String label15=txt15.getText().trim();
        String label16=txt16.getText().trim();
        String label17=txt17.getText().trim();
        String label18=txt18.getText().trim();
        int lbl13VacancyNumber=0;
        int lbl16Salary=0;
        int lbl17WorkingHour=0; 

        if (label13.equals("") || label14.equals("") || label15.equals("") || label16.equals("") 
        || label17.equals("")|| label18.equals("")){
            JOptionPane.showMessageDialog(frame, "please fill all the information in text feilds", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            try{
                lbl13VacancyNumber=Integer.parseInt(label13);
                lbl16Salary= Integer.parseInt(label16);
                lbl17WorkingHour= Integer.parseInt(label17);
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(frame,"Enter Data in correct format","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            for(StaffHire staff : Sh){
                if(staff instanceof PartTimeStaffHire){
                    PartTimeStaffHire myStaff = (PartTimeStaffHire) staff;
                    if(staff.getVacancyNumber()==lbl13VacancyNumber){
                        JOptionPane.showMessageDialog(frame,"Invalid. Enter new vacancy Number","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
            PartTimeStaffHire partTimeStaff= new PartTimeStaffHire(lbl13VacancyNumber,label14,label15,lbl16Salary,
                    lbl17WorkingHour,label18);
            Sh.add(partTimeStaff);
            String partTimeStaffHirePanelVacancyDetails = 
                "Vacancy Number: "+ label13+
                "\n Designation: " + label14 +
                "\n Job Type: " + label15 +
                "\n Working Hour per Day: " + label16 +
                "\n Wages Per Hour: " + label17+
                "\n Shift: " + label18;
            JOptionPane.showMessageDialog(frame, partTimeStaffHirePanelVacancyDetails, "Vacancy Added", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //Here, we call a method as partTimeAppoint//
    public void partTimeAppoint(){
        String label13=txt13.getText().trim();
        String label19=txt19.getText().trim();
        String label20=txt20.getText().trim();
        String label21=txt21.getText().trim();
        String label22=txt22.getText().trim();
        int lbl13VacancyNumber=0;

        if(label13.equals("") || label19.equals("") || label20.equals("") ||
        label21.equals("") || label22.equals("")){
            JOptionPane.showMessageDialog(frame, "please fill all the information in the Text feilds", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
            try{
                lbl13VacancyNumber=Integer.parseInt(label13);   
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(frame,"Enter Data in correct format","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        boolean found = false;
        for(StaffHire staff: Sh){
            if(staff instanceof PartTimeStaffHire){
                PartTimeStaffHire staffs = (PartTimeStaffHire) staff;
                if(staffs.getVacancyNumber()==lbl13VacancyNumber){
                    found = true;
                    if(staffs.getJoined()==false){
                        String partTimeStaffHireDetails = 
                            "Staff Name: "+ label19 +
                            "\n Joining Date: " + label20 +
                            "\n Qualification: " + label21 +
                            "\n Appointed By: " + label22;
                        JOptionPane.showMessageDialog(frame,partTimeStaffHireDetails,"Successfully Appointed",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(frame,"Staff already appointed");

                    }
                    staffs.PartTimeStaffHire(label19,label20,label21,label22);
                    return;
                }
            }
        }
        if(found==false){
            JOptionPane.showMessageDialog(frame,"Invalid. Enter new Vacancy Number");
        }
    }
    //Here, we call a method as partTimeStaffHireDisplay//
    public void partTimeStaffHireDisplay(){
        for(StaffHire staff: Sh){
            if(staff instanceof PartTimeStaffHire){
                PartTimeStaffHire staffs =(PartTimeStaffHire)staff;
                staffs.display();
            }
        }
    }
    //Here, we call a method as partTimeStaffHireClear//
    public void partTimeStaffHireClear(){
        int x = JOptionPane.showConfirmDialog(frame, "Are you sure, you want to clear the informations of partTime", "info", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(frame, "Cleared", "info", JOptionPane.INFORMATION_MESSAGE);
            txt13.setText("");
            txt14.setText("");
            txt15.setText("");
            txt16.setText("");
            txt17.setText("");
            txt18.setText("");
            txt19.setText("");
            txt20.setText("");
            txt21.setText("");
            txt22.setText("");
        }
        else{
        }
    }
    //Here, we call a main method which executes and run all the code//
    public static void main(String[]args){
        new INGNepal().frame.setVisible(true);
    }}

