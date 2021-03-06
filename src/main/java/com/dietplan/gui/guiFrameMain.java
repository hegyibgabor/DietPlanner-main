/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dietplan.gui;

import com.dietplan.BMICalc;
import com.dietplan.FitCalc;
import com.dietplan.mealPlan;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Collections;

/**
 *
 * @author neker
 */
public class guiFrameMain extends javax.swing.JFrame {

    public static String guiGender;
    public static int guiWeight;
    public static int guiHeight;
    public static int guiAge;
    public static String guiFitChange;
    public static int guiExInt;
    public static double guiBMI;
    public int weighthiba = 0;
    public int heighthiba = 0;
    public int agehiba = 0;
    public int exinthiba = 0;
    public int fitchangehiba = 0;


    BMICalc BMI = new BMICalc();
    /**
     * Creates new form guiFrameMain
     */
    public guiFrameMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        FitChangebuttonGroup = new javax.swing.ButtonGroup();
        genderLabel = new javax.swing.JLabel();
        buttonMale = new javax.swing.JRadioButton();
        buttonFemale = new javax.swing.JRadioButton();
        weightLabel = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        heightLabel = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        fitchangeLabel = new javax.swing.JLabel();
        buttonFemale1 = new javax.swing.JRadioButton();
        buttonMale1 = new javax.swing.JRadioButton();
        exintLabel = new javax.swing.JLabel();
        exintTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nutritionTextArea = new javax.swing.JTextArea();
        tablePane = new javax.swing.JScrollPane();
        nutritionTable = new javax.swing.JTable();
        mealsTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Dietetikus");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1085, 544));

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        genderLabel.setText("Nem");

        genderButtonGroup.add(buttonMale);
        buttonMale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonMale.setSelected(true);
        buttonMale.setText("F??rfi");
        buttonMale.setActionCommand("buttonMale");
        buttonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMaleActionPerformed(evt);
            }
        });

        genderButtonGroup.add(buttonFemale);
        buttonFemale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonFemale.setText("N??");
        buttonFemale.setActionCommand("buttonFemale");
        buttonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFemaleActionPerformed(evt);
            }
        });

        weightLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        weightLabel.setText("H??ny kg vagy?");

        weightTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextFieldActionPerformed(evt);
            }
        });

        heightLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        heightLabel.setText("H??ny cm vagy?");

        heightTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        heightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextFieldActionPerformed(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ageLabel.setText("??letkor");

        ageTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        fitchangeLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        fitchangeLabel.setText("Mik a c??ljaid?");

        FitChangebuttonGroup.add(buttonFemale1);
        buttonFemale1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonFemale1.setText("Fogy??s");
        buttonFemale1.setActionCommand("buttonFit");
        buttonFemale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFemale1ActionPerformed(evt);
            }
        });

        FitChangebuttonGroup.add(buttonMale1);
        buttonMale1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonMale1.setSelected(true);
        buttonMale1.setText("Er??s??d??s");
        buttonMale1.setToolTipText("");
        buttonMale1.setActionCommand("buttonStrenght");
        buttonMale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMale1ActionPerformed(evt);
            }
        });

        exintLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        exintLabel.setText("Akt??v ??ra/h??t");

        exintTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exintTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exintTextFieldActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 26)); // NOI18N
        jButton1.setText("Gener??l??s");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);

        nutritionTextArea.setEditable(false);
        nutritionTextArea.setBackground(new java.awt.Color(214, 217, 223));
        nutritionTextArea.setColumns(20);
        nutritionTextArea.setFont(new java.awt.Font("Lato", 1, 20)); // NOI18N
        nutritionTextArea.setLineWrap(true);
        nutritionTextArea.setRows(5);
        nutritionTextArea.setToolTipText("");
        nutritionTextArea.setBorder(null);
        nutritionTextArea.setCaretColor(new java.awt.Color(214, 217, 223));
        nutritionTextArea.setFocusable(false);
        nutritionTextArea.setOpaque(false);
        nutritionTextArea.setRequestFocusEnabled(false);
        nutritionTextArea.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(nutritionTextArea);

        tablePane.setEnabled(false);

        nutritionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N??v", "Kal??ria", "Feh??rje", "Sz??nhidr??t", "Zs??r"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nutritionTable.setToolTipText("");
        nutritionTable.setEnabled(false);
        nutritionTable.setFocusable(false);
        nutritionTable.setGridColor(new java.awt.Color(204, 204, 204));
        nutritionTable.setInheritsPopupMenu(true);
        nutritionTable.setOpaque(false);
        nutritionTable.setRequestFocusEnabled(false);
        nutritionTable.setRowHeight(50);
        nutritionTable.getTableHeader().setResizingAllowed(false);
        nutritionTable.getTableHeader().setReorderingAllowed(false);
        tablePane.setViewportView(nutritionTable);

        mealsTextArea.setEditable(false);
        mealsTextArea.setBackground(new java.awt.Color(214, 217, 223));
        mealsTextArea.setColumns(20);
        mealsTextArea.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        mealsTextArea.setLineWrap(true);
        mealsTextArea.setRows(5);
        mealsTextArea.setTabSize(20);
        mealsTextArea.setText("Reggeli\n\nT??z??rai\n\nEb??d\n\nUzsonna\n\nVacsora");
        mealsTextArea.setAutoscrolls(false);
        mealsTextArea.setBorder(null);
        mealsTextArea.setFocusable(false);
        mealsTextArea.setMaximumSize(new java.awt.Dimension(444, 264));
        mealsTextArea.setMinimumSize(new java.awt.Dimension(1, 1));
        mealsTextArea.setOpaque(false);
        mealsTextArea.setPreferredSize(new java.awt.Dimension(444, 264));
        mealsTextArea.setRequestFocusEnabled(false);
        mealsTextArea.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(genderLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(weightLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fitchangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(heightLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(exintLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonMale1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonFemale1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(exintTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mealsTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonMale)
                            .addComponent(buttonFemale))
                        .addGap(9, 9, 9)
                        .addComponent(weightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(heightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ageLabel)
                        .addGap(9, 9, 9)
                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fitchangeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonFemale1)
                            .addComponent(buttonMale1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exintLabel)
                        .addGap(14, 14, 14)
                        .addComponent(exintTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mealsTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    private void buttonFemaleActionPerformed(java.awt.event.ActionEvent evt){

    }
    private void buttonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMaleActionPerformed

    }//GEN-LAST:event_buttonMaleActionPerformed

    private void weightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextFieldActionPerformed

    }//GEN-LAST:event_weightTextFieldActionPerformed

    private void heightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextFieldActionPerformed

    }//GEN-LAST:event_heightTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed

    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void buttonFemale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFemale1ActionPerformed

    }//GEN-LAST:event_buttonFemale1ActionPerformed

    private void buttonMale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMale1ActionPerformed

    }//GEN-LAST:event_buttonMale1ActionPerformed

    private void exintTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exintTextFieldActionPerformed

    }//GEN-LAST:event_exintTextFieldActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {
        mealsTextArea.setVisible(false);
        mealsTextArea.setEnabled(true);
        mealsTextArea.setVisible(true);
        tablePane.setVisible(true);
        tablePane.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel)nutritionTable.getModel();
        nutritionTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        nutritionTable.getColumnModel().getColumn(0).setMinWidth(320);
        nutritionTable.getColumnModel().getColumn(1).setMinWidth(100);
        nutritionTable.getColumnModel().getColumn(2).setMinWidth(100);
        nutritionTable.getColumnModel().getColumn(3).setMinWidth(120);
        nutritionTable.getColumnModel().getColumn(4).setMinWidth(50);
        model.setRowCount(0);
        // 1.Radio buttons
        //1.1
        String actionCommand = "";
        ButtonModel buttonModel = genderButtonGroup.getSelection();
        actionCommand = buttonModel.getActionCommand();
        if (actionCommand.equals("buttonMale")){
            guiGender = "F";
        }else {
            guiGender = "N";
        }
        //1.2
        String actionCommand2 = "";
        ButtonModel buttonModel2 = FitChangebuttonGroup.getSelection();
        actionCommand2 = buttonModel2.getActionCommand();

        if (actionCommand2.equals("buttonStrenght")){
            guiFitChange = "E";
        } else{
            guiFitChange = "F";
        }

        // 2. Text Fields
        // 2.1 S??ly
        try {
            int answer1 = Integer.parseInt(weightTextField.getText());
            if (answer1 >= 40 && answer1 <= 250) {
                guiWeight = answer1;
                int weighthiba = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Hiba! Val??s s??lyt adj meg!");
                weighthiba = 1;
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Hiba! Csak sz??mot adhatsz meg s??lynak!");
            heighthiba = 1;
        }

        //2.2 Magass??g
        try {
            int answer2 = Integer.parseInt(heightTextField.getText());
            if (answer2 >= 54 && answer2 <= 290) {
                guiHeight = answer2;
                heighthiba = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Hiba! Val??s magass??got adj meg!");
                heighthiba = 1;
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Hiba! Csak sz??mot adhatsz meg magass??gnak!");
            heighthiba = 1;
        }


        //2.3 Kor
        try {
            int answer3 = Integer.parseInt(ageTextField.getText());
            if (answer3 >= 18 && answer3 <= 105) {
                guiAge = answer3;
                agehiba = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Hiba! Val??s ??letkort adj meg!");
                agehiba = 1;
            }
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hiba! Csak sz??mot adhatsz meg ??letkornak!");
            agehiba = 1;
        }



        //2.4 Akt??v ??r??k

        try{
            int answer4 = Integer.parseInt(exintTextField.getText());
            if (answer4 >= 0 && answer4 <= 24) {
                guiExInt = answer4;
                exinthiba = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Hiba! Val??s adatot adj meg!");
                exinthiba = 1;
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Hiba! Csak sz??mot adhatsz meg");
            exinthiba = 1;
        }
        //Setel??nk
        guiGender = this.guiGender;
        guiWeight = this.guiWeight;
        guiHeight = this.guiHeight;
        guiAge = this.guiAge;
        guiFitChange = this.guiFitChange;
        guiExInt = this.guiExInt;
        guiBMI = this.guiBMI;

        guiBMI = BMI.calculate(guiWeight,guiHeight);

       /* System.out.println(guiGender);
        System.out.println(guiWeight);
        System.out.println(guiHeight);
        System.out.println(guiAge);
        System.out.println(guiFitChange);
        System.out.println(guiExInt);
        System.out.println(guiBMI); */

        FitCalc.FitCalc();
        String Nutrition = FitCalc.Nutrition;

        
        if(weighthiba == 0 && heighthiba == 0 && agehiba == 0 && exinthiba == 0 && fitchangehiba == 0) {
            System.out.println(Nutrition);
            nutritionTextArea.setText(Nutrition);
            mealPlan.MealMaker();
            Object[] row1 = {mealPlan.breakfast1.get(0),mealPlan.breakfast1.get(1), mealPlan.breakfast1.get(2),mealPlan.breakfast1.get(3),
                    mealPlan.breakfast1.get(4)};
            Object[] row2 = {mealPlan.brunch1.get(0),mealPlan.brunch1.get(1), mealPlan.brunch1.get(2),mealPlan.brunch1.get(3),
                    mealPlan.brunch1.get(4)};
            Object[] row3 = {mealPlan.lunch1.get(0),mealPlan.lunch1.get(1), mealPlan.lunch1.get(2),mealPlan.lunch1.get(3),
                    mealPlan.lunch1.get(4)};
            Object[] row4 = {mealPlan.afternoon1.get(0),mealPlan.afternoon1.get(1), mealPlan.afternoon1.get(2),mealPlan.afternoon1.get(3),
                    mealPlan.afternoon1.get(4)};
            Object[] row5 = {mealPlan.dinner1.get(0),mealPlan.dinner1.get(1), mealPlan.dinner1.get(2),mealPlan.dinner1.get(3),
                    mealPlan.dinner1.get(4)};

            nutritionTable.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 20));
            nutritionTable.setFont(new Font("Helvetica", Font.BOLD, 20));
            model.addRow(row1);
            model.addRow(row2);
            model.addRow(row3);
            model.addRow(row4);
            model.addRow(row5);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            nutritionTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            nutritionTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            nutritionTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            nutritionTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            nutritionTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            nutritionTable.setOpaque(true);


        }


            


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup FitChangebuttonGroup;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JRadioButton buttonFemale;
    private javax.swing.JRadioButton buttonFemale1;
    private javax.swing.JRadioButton buttonMale;
    private javax.swing.JRadioButton buttonMale1;
    private javax.swing.JLabel exintLabel;
    private javax.swing.JTextField exintTextField;
    private javax.swing.JLabel fitchangeLabel;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mealsTextArea;
    private javax.swing.JTable nutritionTable;
    private javax.swing.JTextArea nutritionTextArea;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables

}
