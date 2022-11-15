import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class TransportGUI implements ActionListener {

    //creating an ArrayList of vehicle class
    ArrayList<Vehicle> arrayList = new ArrayList();

    //GUI components for myFrame
    private JFrame frame;
    private JPanel panel;
    private JButton auto_btn,electric_btn;
    private JLabel label;

    //GUI components for AutoRickshaw class
     private JFrame auto_frame;
     private JPanel auto_panel;
    private JLabel add_l,book_l,VName_l,VId_l,VWeight_l,VColor_l,VSpeed_l,ftc_l,groundC_l,torque_l,engineD_l,book_VId_l,bookedD_l,chargeA_l,nos_l;
    private JTextField VName_tf,VId_tf,VWeight_tf,VColor_tf,VSpeed_tf,ftc_tf,groundC_tf,torque_tf,engineD_tf,book_VId_tf,chargeA_tf,nos_tf;
    private JComboBox comboBox,comboBox1,comboBox2;
    private JButton add_btn,display_btn,clear_btn,back_btn,book_btn;

    //GUI components for ElectricScooter class
    private JFrame e_frame;
    private JPanel e_panel;
    private JLabel add_el,purchase_el,VName_el,VId_el,VWeight_el,VColor_el,VSpeed_el,batteryC_el,purchase_VId_el,brand_el,price_el,chargingT_el,mileage_el,range_el,sell_el,sell_VId_el,sell_price_el;
    private JTextField VName_etf,VId_etf,VWeight_etf,VColor_etf,VSpeed_etf,batteryC_etf,purchase_VId_etf,brand_etf,price_etf,chargingT_etf,mileage_etf,range_etf,sell_price_etf,sell_VId_etf;
    private JButton add_ebtn,purchase_ebtn,sell_btn,display_ebtn,clear_ebtn,back_ebtn;


    //This method contains the buttons for accessing the GUI of ElectricScooter and AutoRickshaw
    public void myFrame(){
        // frame for first gui
        frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        
        // declare panel for first frame
        panel = new JPanel();
        panel.setBounds(0, 0, 400, 300);
        panel.setLayout(null);
        panel.setBackground(new Color(180,215,215));

        // label for displaying Transport GUI
        label = new JLabel("Transport GUI");
        label.setBounds(125, 30, 150, 30);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBackground(new Color(180,215,215));
        label.setOpaque(true);

        // button for AutoRickshaw GUI
        auto_btn = new JButton("AutoRickshaw");
        auto_btn.setBounds(30, 120, 150, 40);
        auto_btn.addActionListener(this);
        auto_btn.setFocusable(false);

        // button for ElectricScooter GUI
        electric_btn = new JButton("ElectricScooter");
        electric_btn.setBounds(210, 120, 150, 40);
        electric_btn.addActionListener(this);
        electric_btn.setFocusable(false);

        // adding components to panel
        panel.add(label);
        panel.add(auto_btn);
        panel.add(electric_btn);

        frame.add(panel);
        frame.setVisible(true);

    }

    //This method contains the GUI for adding and booking AutoRickshaw
    public void auto_GUI(){
        
        // frame for AutoRickshaw gui
        auto_frame = new JFrame("Transport GUI");
        auto_frame.setLayout(null);
        auto_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        auto_frame.setSize(900, 650);
        auto_frame.setLocationRelativeTo(null);
        
        //panel for AutoRickshaw gui 
        auto_panel = new JPanel();
        auto_panel.setBounds(0, 0, 900, 650);
        auto_panel.setLayout(null);
        auto_panel.setBackground(new Color(180,215,215));

        // labels for AutoRickshaw GUI
        add_l = new JLabel("Add an AutoRickshaw:");
        add_l.setBounds(20, 20, 220, 30);
        add_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

        book_l = new JLabel("Book an AutoRickshaw:");
        book_l.setBounds(520, 20, 240, 30);
        book_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

        VName_l = new JLabel("Vehicle Name:");
        VName_l.setBounds(20, 80, 150, 30);
        VName_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VName_tf = new JTextField();
        VName_tf.setBounds(175,80,175,30);


        VId_l = new JLabel("Vehicle ID:");
        VId_l.setBounds(20, 125, 150, 30);
        VId_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VId_tf = new JTextField();
        VId_tf.setBounds(175,125,175,30);


        VWeight_l = new JLabel("Vehicle Weight:");
        VWeight_l.setBounds(20, 170, 150, 30);
        VWeight_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VWeight_tf = new JTextField();
        VWeight_tf.setBounds(175,170,175,30);


        VColor_l = new JLabel("Vehicle Color:");
        VColor_l.setBounds(20, 215, 150, 30);
        VColor_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VColor_tf = new JTextField();
        VColor_tf.setBounds(175,215,175,30);

        VSpeed_l = new JLabel("Vehicle Speed:");
        VSpeed_l.setBounds(20, 260, 150, 30);
        VSpeed_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VSpeed_tf = new JTextField();
        VSpeed_tf.setBounds(175,260,175,30);

        engineD_l = new JLabel("Engine Displacement:");
        engineD_l.setBounds(20, 305, 200, 30);
        engineD_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        engineD_tf = new JTextField();
        engineD_tf.setBounds(200,305,150,30);

        torque_l = new JLabel("Torque:");
        torque_l.setBounds(20, 350, 150, 30);
        torque_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        torque_tf = new JTextField();
        torque_tf.setBounds(175,350,175,30);

        ftc_l = new JLabel("Fuel Tank Capacity:");
        ftc_l.setBounds(20, 395, 150, 30);
        ftc_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        ftc_tf = new JTextField();
        ftc_tf.setBounds(175,395,175,30);

        groundC_l = new JLabel("Ground Clearance:");
        groundC_l.setBounds(20, 440, 150, 30);
        groundC_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        groundC_tf = new JTextField();
        groundC_tf.setBounds(175,440,175,30);

        book_VId_l = new JLabel("Vehicle Id:");
        book_VId_l.setBounds(520, 80, 150, 30);
        book_VId_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        book_VId_tf = new JTextField();
        book_VId_tf.setBounds(675,80,175,30);

        bookedD_l = new JLabel("Booked Date:");
        bookedD_l.setBounds(520, 125, 150, 30);
        bookedD_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));



        chargeA_l = new JLabel("Charge Amount:");
        chargeA_l.setBounds(520, 170, 150, 30);
        chargeA_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        chargeA_tf = new JTextField();
        chargeA_tf.setBounds(675,170,175,30);

        nos_l = new JLabel("Number of Seats:");
        nos_l.setBounds(520, 215, 150, 30);
        nos_l.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        nos_tf = new JTextField();
        nos_tf.setBounds(675,215,175,30);


        //creating arrays for JComboBox and converting them into string before passing them as parameters
        int[] year = {1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005,
                2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020,
                2021, 2022};
        String[] strYear = new String[year.length];

        for (int i = 0; i < year.length; i++) {
            strYear[i] = String.valueOf(year[i]);
        }

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct",
                "Nov", "Dec"};
        int[] date = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
        String[] strDate = new String[date.length];

        for (int i = 0; i < date.length; i++) {
            strDate[i] = String.valueOf(date[i]);
        }

        comboBox = new JComboBox(strYear);
        comboBox.setBounds(650, 130, 80, 25);
        comboBox1 = new JComboBox(months);
        comboBox1.setBounds(740, 130, 55, 25);
        comboBox2 = new JComboBox(strDate);
        comboBox2.setBounds(805, 130, 50, 25);


        // buttons for AutoRickshaw GUI................................................
        add_btn = new JButton("Add AutoRickshaw");
        add_btn.setBounds(40, 510, 175, 40);
        add_btn.addActionListener(this);
        add_btn.setFocusable(false);

        book_btn = new JButton("Book AutoRickshaw");
        book_btn.setBounds(540, 290, 175, 40);
        book_btn.addActionListener(this);
        book_btn.setFocusable(false);

        display_btn = new JButton("Display");
        display_btn.setBounds(520, 510, 140, 40);
        display_btn.addActionListener(this);
        display_btn.setFocusable(false);

        clear_btn = new JButton("Clear");
        clear_btn.setBounds(350, 510, 140, 40);
        clear_btn.addActionListener(this);
        clear_btn.setFocusable(false);

        back_btn = new JButton("Go Back");
        back_btn.setBounds(690, 510, 140, 40);
        back_btn.addActionListener(this);
        back_btn.setFocusable(false);

        // adding buttons in AutoRickshaw panel
        auto_panel.add(add_btn);
        auto_panel.add(display_btn);
        auto_panel.add(back_btn);
        auto_panel.add(book_btn);
        auto_panel.add(clear_btn);

        // adding comboBox in AutoRickshaw panel
        auto_panel.add(comboBox);
        auto_panel.add(comboBox1);
        auto_panel.add(comboBox2);

        //adding labels in AutoRickshaw panel
        auto_panel.add(add_l);
        auto_panel.add(book_l);
        auto_panel.add(VName_l);
        auto_panel.add(VId_l);
        auto_panel.add(VWeight_l);
        auto_panel.add(VColor_l);
        auto_panel.add(VSpeed_l);
        auto_panel.add(ftc_l);
        auto_panel.add(groundC_l);
        auto_panel.add(torque_l);
        auto_panel.add(engineD_l);
        auto_panel.add(book_VId_l);
        auto_panel.add(bookedD_l);
        auto_panel.add(chargeA_l);
        auto_panel.add(nos_l);

        // adding textFields in AutoRickshaw panel
        auto_panel.add(VName_tf);
        auto_panel.add(VId_tf);
        auto_panel.add(VWeight_tf);
        auto_panel.add(VColor_tf);
        auto_panel.add(VSpeed_tf);
        auto_panel.add(ftc_tf);
        auto_panel.add(groundC_tf);
        auto_panel.add(torque_tf);
        auto_panel.add(engineD_tf);
        auto_panel.add(book_VId_tf);
        auto_panel.add(chargeA_tf);
        auto_panel.add(nos_tf);

        auto_frame.add(auto_panel);
        auto_frame.setVisible(true);

    }
    //This method contains the GUI for purchasing and selling Electriscooter
    public void electric_GUI(){
        
        // declaring frame for electricScooter GUI
        e_frame = new JFrame("Transport GUI");
        e_frame.setLayout(null);
        e_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        e_frame.setSize(900, 700);
        e_frame.setLocationRelativeTo(null);

        // declaring panel for ElectricScooter GUI
        e_panel = new JPanel();
        e_panel.setBounds(0, 0, 900, 700);
        e_panel.setLayout(null);
        e_panel.setBackground(new Color(215,240,225));

        // panels in ElectricScooter GUI
        add_el = new JLabel("Add an ElectricScooter:");
        add_el.setBounds(20, 20, 220, 30);
        add_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        purchase_el = new JLabel("Purchase an ElectricScooter:");
        purchase_el.setBounds(520, 20, 260, 30);
        purchase_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        VName_el = new JLabel("Vehicle Name:");
        VName_el.setBounds(40, 80, 150, 30);
        VName_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VName_etf = new JTextField();
        VName_etf.setBounds(175,80,175,30);


        VId_el = new JLabel("Vehicle ID:");
        VId_el.setBounds(40, 125, 150, 30);
        VId_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VId_etf = new JTextField();
        VId_etf.setBounds(175,125,175,30);


        VWeight_el = new JLabel("Vehicle Weight:");
        VWeight_el.setBounds(40, 170, 150, 30);
        VWeight_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VWeight_etf = new JTextField();
        VWeight_etf.setBounds(175,170,175,30);


        VColor_el = new JLabel("Vehicle Color:");
        VColor_el.setBounds(40, 215, 150, 30);
        VColor_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VColor_etf = new JTextField();
        VColor_etf.setBounds(175,215,175,30);

        VSpeed_el = new JLabel("Vehicle Speed:");
        VSpeed_el.setBounds(40, 260, 150, 30);
        VSpeed_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        VSpeed_etf = new JTextField();
        VSpeed_etf.setBounds(175,260,175,30);

        batteryC_el = new JLabel("Battery Capacity:");
        batteryC_el.setBounds(40,305,150,30);
        batteryC_el.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));

        batteryC_etf = new JTextField();
        batteryC_etf.setBounds(175,305,175,30);


        purchase_VId_el = new JLabel("Vehicle Id:");
        purchase_VId_el.setBounds(540, 80, 150, 30);
        purchase_VId_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        purchase_VId_etf = new JTextField();
        purchase_VId_etf.setBounds(675,80,175,30);

        brand_el = new JLabel("Brand:");
        brand_el.setBounds(540, 125, 150, 30);
        brand_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        brand_etf = new JTextField();
        brand_etf.setBounds(675,125,175,30);


        price_el = new JLabel("Price:");
        price_el.setBounds(540, 170, 150, 30);
        price_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        price_etf = new JTextField();
        price_etf.setBounds(675,170,175,30);

        chargingT_el = new JLabel("Charging Time:");
        chargingT_el.setBounds(540, 215, 150, 30);
        chargingT_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        chargingT_etf = new JTextField();
        chargingT_etf.setBounds(675,215,175,30);

        mileage_el = new JLabel("Mileage:");
        mileage_el.setBounds(540, 260, 150, 30);
        mileage_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        mileage_etf = new JTextField();
        mileage_etf.setBounds(675,260,175,30);

        range_el = new JLabel("Range:");
        range_el.setBounds(540, 305, 150, 30);
        range_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        range_etf = new JTextField();
        range_etf.setBounds(675,305,175,30);


        add_ebtn = new JButton("Add");
        add_ebtn.setBounds(60, 365, 150, 40);
        add_ebtn.addActionListener(this);
        add_ebtn.setFocusable(false);

        purchase_ebtn = new JButton("Purchase ");
        purchase_ebtn.setBounds(560, 365, 150, 40);
        purchase_ebtn.addActionListener(this);
        purchase_ebtn.setFocusable(false);


        sell_el = new JLabel("Sell ElectricScooter:");
        sell_el.setBounds(20, 430,200,40);
        sell_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        sell_VId_el = new JLabel("Vehicle Id:");
        sell_VId_el.setBounds(40,480,150,40);
        sell_VId_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        sell_VId_etf = new JTextField();
        sell_VId_etf.setBounds(175,485,150,30);

        sell_price_el = new JLabel("Price:");
        sell_price_el.setBounds(40,525,150,40);
        sell_price_el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        sell_price_etf = new JTextField();
        sell_price_etf.setBounds(175,530,150,30);

        sell_btn = new JButton("Sell");
        sell_btn.setBounds(60,590,150,40);
        sell_btn.addActionListener(this);
        sell_btn.setFocusable(false);


        display_ebtn = new JButton("Display");
        display_ebtn.setBounds(400, 590, 140, 40);
        display_ebtn.addActionListener(this);
        display_ebtn.setFocusable(false);

        clear_ebtn = new JButton("Clear");
        clear_ebtn.setBounds(560, 590, 140, 40);
        clear_ebtn.addActionListener(this);
        clear_ebtn.setFocusable(false);

        back_ebtn = new JButton("Go Back");
        back_ebtn.setBounds(720, 590, 140, 40);
        back_ebtn.addActionListener(this);
        back_ebtn.setFocusable(false);

        e_panel.add(display_ebtn);
        e_panel.add(clear_ebtn);
        e_panel.add(back_ebtn);
        e_panel.add(sell_btn);
        e_panel.add(sell_el);
        e_panel.add(sell_VId_el);
        e_panel.add(sell_VId_etf);
        e_panel.add(sell_price_el);
        e_panel.add(sell_price_etf);
        e_panel.add(add_ebtn);
        e_panel.add(purchase_ebtn);
        e_panel.add(purchase_VId_el);
        e_panel.add(range_el);
        e_panel.add(brand_el);
        e_panel.add(price_el);
        e_panel.add(mileage_el);
        e_panel.add(chargingT_el);
        e_panel.add(add_el);
        e_panel.add(purchase_el);
        e_panel.add(VName_el);
        e_panel.add(VId_el);
        e_panel.add(VWeight_el);
        e_panel.add(VColor_el);
        e_panel.add(VSpeed_el);
        e_panel.add(batteryC_el);

        e_panel.add(purchase_VId_etf);
        e_panel.add(range_etf);
        e_panel.add(brand_etf);
        e_panel.add(price_etf);
        e_panel.add(mileage_etf);
        e_panel.add(chargingT_etf);
        e_panel.add(VName_etf);
        e_panel.add(VId_etf);
        e_panel.add(VWeight_etf);
        e_panel.add(VColor_etf);
        e_panel.add(VSpeed_etf);
        e_panel.add(batteryC_etf);

        e_frame.add(e_panel);
        e_frame.setVisible(true);

    }



    public static void main(String[] args){
        TransportGUI t = new TransportGUI();
        t.myFrame();

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == add_btn){
            try {
                String vehicleName = VName_tf.getText();
                int vehicleId = Integer.parseInt(VId_tf.getText());
                String vehicleWeight = VWeight_tf.getText();
                String vehicleColor = VColor_tf.getText();
                String vehicleSpeed = VSpeed_tf.getText();
                int engineDisplacement = Integer.parseInt(engineD_tf.getText());
                String torque = torque_tf.getText();
                int fuelTankCapacity = Integer.parseInt(ftc_tf.getText());
                String groundClearance = groundC_tf.getText();

                AutoRickshaw a_obj = new AutoRickshaw(vehicleId, vehicleName, vehicleColor, vehicleWeight, vehicleSpeed, engineDisplacement, torque, fuelTankCapacity, groundClearance);

                if(arrayList.isEmpty()){
                    arrayList.add(a_obj);
                    JOptionPane.showMessageDialog(panel,"The AutoRickshaw having id "+vehicleId+" is successfully added");
                }else{
                    boolean flag1 = true;
                    for(Vehicle v:arrayList){

                        if(v instanceof AutoRickshaw){
                            if(v.getVehicleId() == vehicleId){
                                JOptionPane.showMessageDialog(panel,"The AutoRickshaw with id "+ vehicleId +" is already added!!!!!" );
                                flag1 = true;
                                break;
                            }else{
                                flag1 = false;

                            }

                        }else if(v instanceof ElectricScooter){

                            if(v.getVehicleId() == vehicleId){
                                JOptionPane.showMessageDialog(panel,"An ElectricScooter is booked with the ID\n Please try another ID for AutoRickshaw");
                                break;
                            }else{
                                arrayList.add(a_obj);
                                JOptionPane
                                .showMessageDialog(panel,"The AutoRickshaw having ID "+vehicleId+" is successfully added");
                                break;
                            }
                        }

                    }
                    if(flag1 == false){


                        arrayList.add(a_obj);
                        JOptionPane.showMessageDialog(panel,"The AutoRickshaw having id "+vehicleId+" is successfully added");

                    }
                }



            } catch (NumberFormatException NE) {
                if(VId_tf.getText().equals("")|| VName_tf.getText().equals("")|| VWeight_tf.getText().equals("")|| VSpeed_tf.getText().equals("") || VColor_tf.getText().equals("") || engineD_tf.getText().equals("") || torque_tf.getText().equals("") || ftc_tf.getText().equals("") || groundC_tf.getText().equals("")){
                    JOptionPane.showMessageDialog(panel, "Empty Fields!!!!!!!");
                }else{
                    JOptionPane.showMessageDialog(panel,"Number Format Exception!!!!!!!!!\n Please Enter the right data type.");
                }

            }
        }else if(e.getSource() == add_ebtn){
            try{
                String vehicleName = VName_etf.getText();
                int vehicleId = Integer.parseInt(VId_etf.getText());
                String vehicleWeight = VWeight_etf.getText();
                String vehicleColor = VColor_etf.getText();
                String vehicleSpeed = VSpeed_etf.getText();
                int batteryCapacity = Integer.parseInt(batteryC_etf.getText());

                ElectricScooter  e_obj = new ElectricScooter(vehicleId,vehicleName,vehicleColor,vehicleWeight,vehicleSpeed,batteryCapacity);

                if(arrayList.isEmpty()){
                    arrayList.add(e_obj);
                    JOptionPane.showMessageDialog(panel,"The electric scooter having id "+ vehicleId +" is successfully added!!");
                }else{
                    boolean flag2 = true;
                    for(Vehicle v:arrayList){
                        if(v instanceof ElectricScooter){
                            if(v.getVehicleId() == vehicleId){
                                JOptionPane.showMessageDialog(panel,"The electric scooter you're trying to add is already added ");
                                flag2 = true;
                                break;
                            }else{
                                flag2 = false;
                            }
                        }else if(v instanceof AutoRickshaw){
                            if(v.getVehicleId() == vehicleId){
                                JOptionPane.showMessageDialog(panel,"An autoRickshaw is booked with the ID\n Please try another ID for ElectricScooter");
                                break;

                            }else{
                                arrayList.add(e_obj);
                                JOptionPane.showMessageDialog(panel,"The electric scooter having id "+ vehicleId +" is successfully added!!");
                            }
                        }

                    }if(flag2 == false){
                        arrayList.add(e_obj);
                        JOptionPane.showMessageDialog(panel,"The electric scooter having id "+ vehicleId +" is successfully added!!");

                    }
                }




            }catch(NumberFormatException NE){
                if(VId_etf.getText().equals("")|| VName_etf.getText().equals("")|| VWeight_etf.getText().equals("")|| VSpeed_etf.getText().equals("") || VColor_etf.getText().equals("") || batteryC_etf.getText().equals("")){
                    JOptionPane.showMessageDialog(panel, "Empty Fields!!!!!!!");
                }else{
                    JOptionPane.showMessageDialog(panel,"Number Format Exception!!!!!!!!!\n Please Enter the right data type.");
                }
            }
        }
        else if(e.getSource() == book_btn){
            try {
                int vehicleId = Integer.parseInt(book_VId_tf.getText());
                int chargeAmount = Integer.parseInt(chargeA_tf.getText());
                String cb = String.valueOf(comboBox.getSelectedItem());
                String cb1 = comboBox1.getSelectedItem().toString();
                String cb2 = comboBox2.getSelectedItem().toString();

                String bookedDate= cb +"/"+ cb1+"/" + cb2;
                int numberOfSeats = Integer.parseInt(nos_tf.getText());


                if(arrayList.isEmpty()){
                    JOptionPane.showMessageDialog(panel,"There is no auto-Rickshaw to be booked!!!!!!!!!!!!!");
                }else{
                    for (Vehicle v : arrayList) {
                        if (v instanceof AutoRickshaw) {
                            AutoRickshaw autoObj = (AutoRickshaw) v;
                            if (vehicleId == autoObj.getVehicleId()) {

                                if(autoObj.getIsBooked() == false){
                                    autoObj.bookAutoRickshaw(bookedDate, chargeAmount, numberOfSeats);
                                    JOptionPane.showMessageDialog(panel, "The autoRickshaw having id " + vehicleId + "\n is booked on " + bookedDate + " date \nand the charge amount is "+chargeAmount+" and number of seats is "+numberOfSeats);

                                }else{
                                    JOptionPane.showMessageDialog(panel,"The autoRickshaw with vehicleId "+vehicleId + " is already booked!!");

                                }


                            }else{
                                JOptionPane.showMessageDialog(panel, "There is no AutoRickshaw with VehicleId " +vehicleId );

                            }

                        } else if(v instanceof ElectricScooter) {
                            JOptionPane.showMessageDialog(panel,"This is an instance of Electric Scooter");
                            break;

                        }

                    }

                }

            } catch (NumberFormatException ee1) {
                if(book_VId_tf.getText().equals("")|| chargeA_tf.getText().equals("")||nos_tf.getText().equals("")){
                    JOptionPane.showMessageDialog(panel, "Empty Fields!!!!!!!");
                }else{
                    JOptionPane.showMessageDialog(panel,"Number Format Exception!!!!!!!!!\n Please Enter the right data type.");
                }

            }
        }
        else if(e.getSource() == display_btn){

            if(arrayList.isEmpty()){
                JOptionPane.showMessageDialog(panel,"Nothing to display\nFirst add an AutoRickshaw!!!!!!");
            }else{
                for(Vehicle v:arrayList){
                    if(v instanceof AutoRickshaw){
                        AutoRickshaw ae = (AutoRickshaw) v;
                        ae.display();
                        break;
                    }
                }
            }


        }else if(e.getSource() == clear_btn){
            VId_tf.setText("");
            VName_tf.setText("");
            VWeight_tf.setText("");
            VColor_tf.setText("");
            VSpeed_tf.setText("");
            ftc_tf.setText("");
            groundC_tf.setText("");
            torque_tf.setText("");
            engineD_tf.setText("");
            book_VId_tf.setText("");
            chargeA_tf.setText("");
            nos_tf.setText("");
            comboBox.setSelectedItem("1995");
            comboBox1.setSelectedItem("Jan");
            comboBox2.setSelectedItem("1");


        }else if(e.getSource() == clear_ebtn){

            VName_etf.setText("");
            VId_etf.setText("");
            VWeight_etf.setText("");
            VColor_etf.setText("");
            VSpeed_etf.setText("");
            batteryC_etf.setText("");
            purchase_VId_etf.setText("");
            brand_etf.setText("");
            price_etf.setText("");
            chargingT_etf.setText("");
            mileage_etf.setText("");
            range_etf.setText("");
            sell_price_etf.setText("");
            sell_VId_etf.setText("");
        }
        else if(e.getSource() == display_ebtn){

            if(arrayList.isEmpty()){
                JOptionPane.showMessageDialog(panel,"Nothing to display\nFirst add an ElectricScooter!!!!!!");
            }else{
                for(Vehicle v:arrayList){
                    if(v instanceof ElectricScooter){
                        ElectricScooter el = (ElectricScooter) v;
                        el.display();
                    }
                }
            }

        }
        else if(e.getSource() == purchase_ebtn){
            try{
                String brand = brand_etf.getText();
                int vehicleId = Integer.parseInt(purchase_VId_etf.getText());
                int price =Integer.parseInt(price_etf.getText());
                String chargingTime = chargingT_etf.getText();
                String mileage = mileage_etf.getText();
                int range = Integer.parseInt(range_etf.getText());

                if(arrayList.isEmpty()){
                    JOptionPane.showMessageDialog(panel,"There is no ElectricScooter to purchase,\nFirst add an Electric Scooter!!");
                }else{
                    boolean flag = true;
                    boolean flag2 = true;
                    for(Vehicle v:arrayList){
                        if(v instanceof ElectricScooter){
                            flag2
                            
                            = true;
                            if(vehicleId == v.getVehicleId()){
                                flag = true;
                                ElectricScooter electric = (ElectricScooter)v;
                                if(electric.getHasPurchased() == false){
                                    electric.purchase(brand,price,chargingTime,mileage,range);
                                    JOptionPane.showMessageDialog(panel, "The electricScooter having id " + vehicleId + " is successfully purchased\n and brand is "+brand+" and price is "+price+" \nand charging time is "+chargingTime+" \nand mileage is "+mileage+" and range is "+range);
                                    
                                }else{
                                    JOptionPane.showMessageDialog(panel,"The electricScooter is already purchased!!!!!");
                                    break;

                                }


                            }else{

                                flag = false;

                            }

                        }else{
                            
                            flag2 = false;
                        }
                    }if(flag2 == false){
                        JOptionPane.showMessageDialog(panel,"Instance of ElectricScooter not found!!!!!");
                    }
                    if(flag == false){
                        JOptionPane.showMessageDialog(panel, "There is no ElectricScooter with VehicleId " +vehicleId );
                    }
                }

            }catch(NumberFormatException ne){
                if(brand_etf.getText().equals("")|| purchase_VId_etf.getText().equals("")|| price_etf.getText().equals("")|| chargingT_etf.getText().equals("") || mileage_etf.getText().equals("") || range_etf.getText().equals("")){
                    JOptionPane.showMessageDialog(panel, "Empty Fields!!!!!!!");
                }else{
                    JOptionPane.showMessageDialog(panel,"Number Format Exception!!!!!!!!!\n Please Enter the right data type.");
                }
            }

        }
        else if(e.getSource() == back_btn){
            auto_frame.setVisible(false);
            this.myFrame();
        }else if(e.getSource() == auto_btn){
            frame.setVisible(false);
            this.auto_GUI();

        }else if(e.getSource() == electric_btn){
            frame.setVisible(false);
            this.electric_GUI();
        }
        else if(e.getSource() == back_ebtn){
            e_frame.setVisible(false);
            this.myFrame();

        }else if(e.getSource() == sell_btn){
            try{
                int vehicleId = Integer.parseInt(sell_VId_etf.getText());
                int price = Integer.parseInt(sell_price_etf.getText());


                if(arrayList.isEmpty()){
                    JOptionPane.showMessageDialog(panel,"There is no ElectricScooter to sell,\nFirst add an Electric Scooter!!");

                }else{

                    for(Vehicle v:arrayList){
                        if(v instanceof ElectricScooter){
                            ElectricScooter electric = (ElectricScooter)v;

                            if(vehicleId == electric.getVehicleId()) {

                                if (electric.getHasPurchased()) {
                                    electric.sell(price);
                                    JOptionPane.showMessageDialog(panel, "The electricScooter having id " + vehicleId + " is successfully sold\n and price is " + price);
                                } else {
                                    JOptionPane.showMessageDialog(panel, "The ElectricScooter you're trying to sell has not been purchased");
                                }

                            }else{
                                JOptionPane.showMessageDialog(panel, "There is no ElectricScooter with VehicleId " +vehicleId );

                            }


                        }
                    }
                }


            }catch(NumberFormatException ne){
                if(sell_VId_etf.getText().equals("")|| sell_price_etf.getText().equals("")){
                    JOptionPane.showMessageDialog(panel, "Empty Fields!!!!!!!");
                }else{
                    JOptionPane.showMessageDialog(panel,"Number Format Exception!!!!!!!!!\n Please Enter the right data type.");
                }
            }
        }

    }
}