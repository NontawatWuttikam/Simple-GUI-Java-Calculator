package calculator;

import java.text.DecimalFormat;

public class Calculator extends javax.swing.JFrame {

    static int powValue;//เก็บค่ายกกำลังที่ดีงมาจากฟอร์มอื่น
    static int sqrtValue;//เก็บค่าสแควร์รูทที่ดึงมาจากฟอร์มอื่น
    static String CurrentNo = ""; //เก็บเลขปัจจุบันที่ดึงมาจากกล่องข้อความ
    char Symbol; //เก็บสัญลักษณ์เพื่อใช้อ้างอิงในการคำนวณใน case
    Double sum = 0.0;//ผลรวมที่คำนวณเสร็จแล้ว รอนำไปรวมกับ previousno
    Double PreviousNo;//เลขก่อนหน้าที่ถูกเก็บไว้เพื่อไปคำนวณตาม case
    int i = 0; //ตัวแปรอ้างอิงใช้ในการกำหนดเงื่อนไขปุ่ม

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextBox = new javax.swing.JTextField();
        No7 = new javax.swing.JButton();
        No8 = new javax.swing.JButton();
        No4 = new javax.swing.JButton();
        No1 = new javax.swing.JButton();
        No5 = new javax.swing.JButton();
        No2 = new javax.swing.JButton();
        No9 = new javax.swing.JButton();
        No6 = new javax.swing.JButton();
        No3 = new javax.swing.JButton();
        No0 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EqualButton = new javax.swing.JButton();
        PreSum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Dot = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        ClearVar = new javax.swing.JButton();
        Store = new javax.swing.JButton();
        power = new javax.swing.JButton();
        Expo = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        Random = new javax.swing.JButton();
        Bar = new javax.swing.JMenuBar();
        StoredVal = new javax.swing.JMenu();
        StoredVal1 = new javax.swing.JMenu();
        Pi = new javax.swing.JMenuItem();
        e = new javax.swing.JMenuItem();
        G = new javax.swing.JMenuItem();
        c = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        TextBox.setEditable(false);
        TextBox.setBackground(new java.awt.Color(0, 0, 255));
        TextBox.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        TextBox.setForeground(new java.awt.Color(0, 255, 0));

        No7.setText("7");
        No7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No7ActionPerformed(evt);
            }
        });

        No8.setText("8");
        No8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No8ActionPerformed(evt);
            }
        });

        No4.setText("4");
        No4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No4ActionPerformed(evt);
            }
        });

        No1.setText("1");
        No1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No1ActionPerformed(evt);
            }
        });

        No5.setText("5");
        No5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No5ActionPerformed(evt);
            }
        });

        No2.setText("2");
        No2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No2ActionPerformed(evt);
            }
        });

        No9.setText("9");
        No9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No9ActionPerformed(evt);
            }
        });

        No6.setText("6");
        No6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No6ActionPerformed(evt);
            }
        });

        No3.setText("3");
        No3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No3ActionPerformed(evt);
            }
        });

        No0.setText("0");
        No0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No0ActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Plus.setBackground(new java.awt.Color(255, 51, 51));
        Plus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Minus.setBackground(new java.awt.Color(102, 204, 255));
        Minus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Divide.setBackground(new java.awt.Color(255, 255, 51));
        Divide.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Divide.setText("÷");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        Multiply.setBackground(new java.awt.Color(153, 255, 51));
        Multiply.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Multiply.setText("x");
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Boat and Pump 's Calculator");

        EqualButton.setBackground(new java.awt.Color(204, 255, 255));
        EqualButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EqualButton.setText("=");
        EqualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualButtonActionPerformed(evt);
            }
        });

        PreSum.setEditable(false);

        jLabel2.setText("Previous sum");

        Dot.setBackground(new java.awt.Color(204, 255, 255));
        Dot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dot.setText(".");
        Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotActionPerformed(evt);
            }
        });

        X.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        X.setForeground(new java.awt.Color(255, 0, 0));
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        Y.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Y.setForeground(new java.awt.Color(0, 153, 0));
        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        Z.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Z.setForeground(new java.awt.Color(0, 0, 255));
        Z.setText("Z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        ClearVar.setText("Clear Variable");
        ClearVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearVarActionPerformed(evt);
            }
        });

        Store.setText("Store");
        Store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreActionPerformed(evt);
            }
        });

        power.setText("X^2");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        Expo.setText("X^i");
        Expo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpoActionPerformed(evt);
            }
        });

        sqrt.setText("SRoot");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        Random.setText("Random");
        Random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomActionPerformed(evt);
            }
        });

        StoredVal.setText("Stored Value");
        Bar.add(StoredVal);

        StoredVal1.setText("Scientific Constant");

        Pi.setText("Pi");
        Pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiActionPerformed(evt);
            }
        });
        StoredVal1.add(Pi);

        e.setText("euler Number (e)");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        StoredVal1.add(e);

        G.setText("Earth Gravity (g)");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        StoredVal1.add(G);

        c.setText("Speed Of light (c)");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        StoredVal1.add(c);

        Bar.add(StoredVal1);

        setJMenuBar(Bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextBox)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Store, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Dot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(No7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(No4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(No1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(No0, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(No2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(No5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(No8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Y, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(No3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(No6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(No9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EqualButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Z, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(power, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Expo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Random, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PreSum)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(ClearVar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Multiply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Plus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(Clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(power, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(No8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(No9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(No7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(No4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(No5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(No6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Expo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(No2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(No1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(No0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PreSum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Random, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EqualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearVar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Store, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void No1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No1ActionPerformed
        CurrentNo += Number("1");
        UpdateTextBox();
    }//GEN-LAST:event_No1ActionPerformed

    private void No2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No2ActionPerformed
        CurrentNo += Number("2");
        UpdateTextBox();
    }//GEN-LAST:event_No2ActionPerformed

    private void No3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No3ActionPerformed
        CurrentNo += Number("3");
        UpdateTextBox();
    }//GEN-LAST:event_No3ActionPerformed

    private void No4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No4ActionPerformed
        CurrentNo += Number("4");
        UpdateTextBox();
    }//GEN-LAST:event_No4ActionPerformed

    private void No5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No5ActionPerformed
        CurrentNo += Number("5");
        UpdateTextBox();
    }//GEN-LAST:event_No5ActionPerformed

    private void No6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No6ActionPerformed
        CurrentNo += Number("6");
        UpdateTextBox();
    }//GEN-LAST:event_No6ActionPerformed

    private void No7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No7ActionPerformed
        CurrentNo += Number("7");
        UpdateTextBox();
    }//GEN-LAST:event_No7ActionPerformed

    private void No8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No8ActionPerformed
        CurrentNo += Number("8");
        UpdateTextBox();
    }//GEN-LAST:event_No8ActionPerformed

    private void No9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No9ActionPerformed
        CurrentNo += Number("9");
        UpdateTextBox();
    }//GEN-LAST:event_No9ActionPerformed

    private void No0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No0ActionPerformed
        CurrentNo += Number("0");
        UpdateTextBox();
    }//GEN-LAST:event_No0ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        ClearAll();
    }//GEN-LAST:event_ClearActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        Delete();
    }//GEN-LAST:event_DeleteActionPerformed

    private void EqualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualButtonActionPerformed
        Equals();
        
    }//GEN-LAST:event_EqualButtonActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        Plus();
    }//GEN-LAST:event_PlusActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        Minus();
    }//GEN-LAST:event_MinusActionPerformed

    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyActionPerformed
        Multiply();
    }//GEN-LAST:event_MultiplyActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        Divide();
    }//GEN-LAST:event_DivideActionPerformed

    private void DotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DotActionPerformed
        CurrentNo += Number(".");
        UpdateTextBox();
    }//GEN-LAST:event_DotActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        xMethod();
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
       yMethod();
    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        zMethod();
    }//GEN-LAST:event_ZActionPerformed

    private void ClearVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearVarActionPerformed
       VarReset();
    }//GEN-LAST:event_ClearVarActionPerformed

    private void StoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoreActionPerformed
        StoredVal.add(TextBox.getText());
    }//GEN-LAST:event_StoreActionPerformed

    private void PiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiActionPerformed
        CurrentNo += String.valueOf("3.14159265");
        UpdateTextBox();
    }//GEN-LAST:event_PiActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        CurrentNo += String.valueOf("2.71828");
        UpdateTextBox();
    }//GEN-LAST:event_eActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        CurrentNo += String.valueOf("9.81");
        UpdateTextBox();
    }//GEN-LAST:event_GActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        Power();
    }//GEN-LAST:event_powerActionPerformed

    private void ExpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpoActionPerformed
        Expo();

    }//GEN-LAST:event_ExpoActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed
        sqrt();
    }//GEN-LAST:event_sqrtActionPerformed

    private void RandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomActionPerformed
        CallRandomWin();
    }//GEN-LAST:event_RandomActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        CurrentNo += String.valueOf("299792458");
        UpdateTextBox();
    }//GEN-LAST:event_cActionPerformed
    private void UpdateTextBox() {
        TextBox.setText(CurrentNo);
    }

    private void operand() {
        switch (Symbol) {
            case '+':
                sum += PreviousNo;
                break;
            case '-':
                sum -= PreviousNo;
                break;
            case '*':
                sum *= PreviousNo;
                break;
            case '/':
                sum /= PreviousNo;
                break;
        }
    }

    public static void setExpo(int exp) {
        powValue = exp;
        TextBox.setText(CurrentNo + "^" + String.valueOf(exp));
        CurrentNo = String.valueOf(Math.pow(Double.parseDouble(CurrentNo), exp));

    }

    public static void setSqrt(int sqrt) {
        sqrtValue = sqrt;
        TextBox.setText("√" + sqrtValue);
        CurrentNo = String.valueOf(Math.sqrt(sqrtValue));
    }

    public static void setRandom(int random) {
        TextBox.setText(String.valueOf(random));
        CurrentNo = String.valueOf(random);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);

            }
        });
    }
    private String Number(String s) {
        
        return s;
    }
    private void ClearAll()
    {
        CurrentNo = "";
        this.sum = 0.0;
        PreSum.setText("");
        UpdateTextBox();
        PreviousNo = 0.0;
        i = 0;
    }
    private void Delete() {
        if (CurrentNo.length() != 0) {
            int position = CurrentNo.length();
            CurrentNo = CurrentNo.substring(0, CurrentNo.length() - 1);
            UpdateTextBox();
        } else {
    
    }
    }
    private void Plus() {
        while (!TextBox.getText().equals("")) {
            PreviousNo = Double.parseDouble(CurrentNo); //ดึงค่าจาก textbox เก็บไว้ใน previousNo
            if (i != 0) {
                operand(); //ค่าตัวถัดๆมาจะคำนวณต่อไป
            } else if (i == 0) {
                sum += PreviousNo; //ถ้าเป็นค่าตัวแรกที่เริ่มคำนวนจะทำการเก็บไว้ใน sum ก่อน
            }
            Symbol = '+'; //คำนวณก่อนเซตเครื่องหมาย เพราะเมื่อกดปุ่มไดๆ ต้องคำนวณเลขสุดท้าย
            //ด้วยเครื่องหมายก่อนหน้าซะก่อน
            PreSum.setText(sum.toString());
            if (!TextBox.getText().equals("")) {
                System.out.println("i++");
                i++;//บวกตัวแปรอ้างอิงด้วยเมื่อมีการรับตัวเลขจากล่อง
            }
            CurrentNo = "";
            UpdateTextBox();
        }
    }
    private void Minus() {
        while (!TextBox.getText().equals("")) {
            PreviousNo = Double.parseDouble(CurrentNo);
            if (i != 0) {
                operand();
            } else if (i == 0) {
                sum += PreviousNo;
            }
            Symbol = '-';
            PreSum.setText(sum.toString());
            if (!TextBox.getText().equals("")) {
                System.out.println("i++");
                i++;
            }
            CurrentNo = "";
            UpdateTextBox();
        }
    }
    private void Multiply() {
        while (!TextBox.getText().equals("")) {
            PreviousNo = Double.parseDouble(CurrentNo);
            if (i != 0) {
                operand();
            } else if (i == 0) {
                sum = PreviousNo;
            }
            Symbol = '*';
            PreSum.setText(sum.toString());
            if (!TextBox.getText().equals("")) {
                System.out.println("i++");
                i++;
            }
            CurrentNo = "";
            UpdateTextBox();
        }
    }
    private void Divide() {
        while (!TextBox.getText().equals("")) {
            PreviousNo = Double.parseDouble(CurrentNo);
            if (i != 0) {
                operand();
            }
            if (i == 0) {
                sum = PreviousNo;
            }
            Symbol = '/';
            PreSum.setText(sum.toString());
            if (!TextBox.getText().equals("")) {
                System.out.println("i++");
                i++;
            }
            CurrentNo = "";
            UpdateTextBox();
        }
    }
    
    private void Equals() {
        while (CurrentNo != "" && this.sum != 0) {
            PreviousNo = Double.parseDouble(CurrentNo);
            if (i != 0) {

                operand();
                TextBox.setText(sum.toString());
            }
            CurrentNo = TextBox.getText(); //เคลียร์ตัวแปร
            this.sum = 0.0;
            i = 0;
        }
        if (CurrentNo != "" && this.sum == 0.0) { //Check Square ยกกำลัง
            TextBox.setText(CurrentNo);
        }
    }
    private void xMethod() {
        while (true) {
            if(!TextBox.getText().equals("")) {
            if (X.getText().equals("X")) {
                X.setText(TextBox.getText());
            } 
            }
            else {
                CurrentNo += X.getText();
                UpdateTextBox();
            }
            break;
        }
    }
    private void yMethod() {
        while (true) {
            if(!TextBox.getText().equals("")) {
            if (Y.getText().equals("Y")) {
                Y.setText(TextBox.getText());
            } 
            }
            else {
                CurrentNo += Y.getText();
                UpdateTextBox();
            }
            break;
        }
    }
    private void zMethod() {
       while (true) {
            if(!TextBox.getText().equals("")) {
            if (Y.getText().equals("Y")) {
                Y.setText(TextBox.getText());
            } 
            }
            else {
                CurrentNo += Y.getText();
                UpdateTextBox();
            }
            break;
        }
    }
    private void VarReset() {
         X.setText("X");
        Y.setText("Y");
        Z.setText("Z");
    }
    private void Power()
    {
        while (!TextBox.getText().equals("")) {
            TextBox.setText(CurrentNo + "^2");
            CurrentNo = String.valueOf(Math.pow(Double.parseDouble(CurrentNo), 2));
            break;
        }
    }
    private void Expo() {
        while (!TextBox.getText().equals("")) {
            Power po = new Power();
            po.setVisible(true);
            break;
        }
    }
    private void sqrt() {
        SquareRoot sroot = new SquareRoot();
        sroot.setVisible(true);
    }
    private void CallRandomWin() {
        Randoms rand = new Randoms();
        rand.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Bar;
    private javax.swing.JButton Clear;
    private javax.swing.JButton ClearVar;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Dot;
    private javax.swing.JButton EqualButton;
    private javax.swing.JButton Expo;
    private javax.swing.JMenuItem G;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton No0;
    private javax.swing.JButton No1;
    private javax.swing.JButton No2;
    private javax.swing.JButton No3;
    private javax.swing.JButton No4;
    private javax.swing.JButton No5;
    private javax.swing.JButton No6;
    private javax.swing.JButton No7;
    private javax.swing.JButton No8;
    private javax.swing.JButton No9;
    private javax.swing.JMenuItem Pi;
    private javax.swing.JButton Plus;
    private javax.swing.JTextField PreSum;
    javax.swing.JButton Random;
    private javax.swing.JButton Store;
    private javax.swing.JMenu StoredVal;
    private javax.swing.JMenu StoredVal1;
    public static javax.swing.JTextField TextBox;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JMenuItem c;
    private javax.swing.JMenuItem e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton power;
    private javax.swing.JButton sqrt;
    // End of variables declaration//GEN-END:variables
}


