/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectstack;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JPanel;


public class Create extends javax.swing.JFrame {
    
    int size = 1;
    int TOP1 = -1, MAXSTK1=0, STACK1[]= new int[size], ITEM;
    int TOP2 = -1, MAXSTK2, STACK2[];
    int TOP3 = -1, MAXSTK3, STACK3[];
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Create.class.getName());



        public  void PUSH(int item) {
        if (TOP1 == MAXSTK1-1) {
            System.out.println("OVERFLOW");
        } else {
          TOP1++;     
           STACK1[TOP1] = item;
        System.out.println("PUSH :" + item + "  OK.");
  //      jTable1.setValueAt(STACK[TOP], (9-TOP), 0);
        }
    }
       
//------------------------------------
    public  void POP(){
    if(TOP1==-1)
           System.out.println("UNDERFLOW");
       
     else
    {
       ITEM=STACK1[TOP1];
       --TOP1;
    }
    System.out.println("Pop Data: "+ITEM);
 }
    public  void showDatainStack() {
        System.out.println();
        System.out.print("Stack:");
     //   for (int i = 0; i <= TOP; i++){ jTable1.setValueAt("", (9-TOP), 0); }
        for (int i = 0; i <= TOP1; i++) {
            System.out.print(STACK1[i] + ",");
            jTable1.setValueAt(STACK1[i], ((size-1)-i), 0);
        }
    }
 public  void clearDatainStack(int TOP) {       
        for (int i = 0; i <= (TOP+1); i++) {
            jTable1.setValueAt("", ((size-1)-i), 0);
        }
    }
    
        public  void showDatainStack2() {
        System.out.println();
        System.out.print("Stack:");
     //   for (int i = 0; i <= TOP; i++){ jTable1.setValueAt("", (9-TOP), 0); }
        for (int i = 0; i <= TOP2; i++) {
            System.out.print(STACK2[i] + ",");
            jTable2.setValueAt(STACK2[i], ((size-1)-i), 0);
        }
    }
         public  void showDatainStack3() {
        System.out.println();
        System.out.print("Stack:"); 
     //   for (int i = 0; i <= TOP; i++){ jTable1.setValueAt("", (9-TOP), 0); }
        for (int i = 0; i <= TOP3; i++) {
            System.out.print(STACK3[i] + ",");
            jTable3.setValueAt(STACK3[i], ((size-1)-i), 0);
        }
    }
         public int checkValue(Object value) {
    int res=-1;
    if (value instanceof String) {
        String str = (String) value;
        
        try {
            // ถ้าแปลงเป็นเลขได้ แสดงว่าไม่ใช่ pure string
            res=Integer.parseInt(str);
            System.out.println("This is a number: " + str);
        } catch (NumberFormatException e) {
            // ถ้าแปลงไม่ได้ = เป็นข้อความ
            System.out.println("This is a String: " + str);
            return res; // ออกจากฟังก์ชัน
        }
    } else {
        // กรณีเป็น object อื่นๆ
        System.out.println("Not a string: " + value);
    }
    return res;
}
         
    public Create() {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/blackground.png"));
        

Image img = icon.getImage();
Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);

// ใส่ลง JLabel
ImageIcon scaledIcon = new ImageIcon(newImg);
JLabel bgLabel = new JLabel(scaledIcon);

// ขยายเต็มเฟรม
bgLabel.setBounds(0, 0, this.getWidth(), this.getHeight());

// ใส่ลง JLayeredPane
jLayeredPane1.add(bgLabel, JLayeredPane.DEFAULT_LAYER);
this.setSize(jLayeredPane1.getPreferredSize()); 
    this.setResizable(false); // ไม่ให้ยืด
    this.setLocationRelativeTo(null); // จอกลาง
    
        jTable1.setRowHeight(30);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTable1.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 18));
        
        jTable2.setRowHeight(30);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTable2.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 18));

        jTable3.setRowHeight(30);
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTable3.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 18));
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER); // แนวนอน
        centerRenderer.setVerticalAlignment(SwingConstants.CENTER);   // แนวตั้ง
        
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(200,200,200), 2, true));
        jTable1.setBackground(new Color(255, 192, 203));
        jTable2.setBackground(new Color(173, 253, 162));    
        jTable3.setBackground(new Color(177, 252, 250));
        
        jButton4.setBackground(new Color(173, 253, 162));  
         jButton5.setBackground(new Color(177, 252, 250));
         jButton6.setBackground(new Color(255, 192, 203));
         jButton7.setBackground(new Color(177, 252, 250));
         jButton8.setBackground(new Color(255, 192, 203));
        jButton9.setBackground(new Color(173, 253, 162));    
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();

                // ไล่สีจากบนลงล่าง
                Color color1 = new Color(60, 90, 91);
                Color color2 = new Color(186, 208, 209);
                GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, width, height);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton2.setText("PUSH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 153));
        jButton10.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jButton10.setText("Reverse");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton3.setText("POP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/s4.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(51, 153, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setForeground(new java.awt.Color(0, 153, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel1.setText("TOP1 = -1");

        jLabel3.setText("TOP2 = -1");

        jLabel4.setText("TOP3 = -1");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MAXSTACK = ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MAXSTACK = ");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MAXSTACK = ");

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 0));
        jButton4.setText("m2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("m3");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("m1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("m3");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setText("m1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 153, 0));
        jButton9.setText("m2");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setText(">");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setText("<");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton14.setText("<");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton15.setText(">");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jButton1.setText("Build STACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(408, 408, 408))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(547, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String inputStr = JOptionPane.showInputDialog(null, "กรอกตัวเลข จำนวนช่องของ Stack\n(ระบุ 1-7 ช่อง)");
        System.out.println("Pls take number from 1-7 for stack");
        int input;
        input=checkValue(inputStr);
        if(input==-1){
            System.out.println("Pls take number not string");
             JOptionPane.showMessageDialog(null, "กรอกตัวเลขเท่านั้นค่ะ ");
             return;
        }
       if(inputStr!=null){
           input = Integer.parseInt(inputStr);
           if(input <1 || input >7){
                System.out.println("Pls take number from 1-7 for stack");
                JOptionPane.showMessageDialog(null, "ระบุตัวเลข 1-7 ค่าา ");
                
                 return;
           }
           DefaultTableModel model1 = new DefaultTableModel(new Object[]{"STACK1"}, 0);
                 jTable1.setModel(model1);
                  DefaultTableModel model2 = new DefaultTableModel(new Object[]{"STACK2"}, 0);
                 jTable2.setModel(model2);
                  DefaultTableModel model3 = new DefaultTableModel(new Object[]{"STACK3"}, 0);
                 jTable3.setModel(model3);
                for (int i = 0; i < input; i++) {
                    model1.addRow(new Object[]{""});
                    model2.addRow(new Object[]{""});
                    model3.addRow(new Object[]{""});
            }
       }else{
           System.out.println("Pls take number from 1-7 for stack");
           
           return;
       }
       
       TOP1=TOP2=TOP3=-1;
        size=MAXSTK1=MAXSTK2=MAXSTK3=input;
        
        STACK1= new int[size];
        STACK2= new int[size];
        STACK3= new int[size];
        jLabel5.setText("MAXSTACK1 = "+MAXSTK1);
        jLabel6.setText("MAXSTACK2 = "+MAXSTK2);
        jLabel7.setText("MAXSTACK3 = "+MAXSTK3);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String inputStr = JOptionPane.showInputDialog(null, "กรอกตัวเลขเพื่อใส่ค่าลงไป");
        System.out.println("Pls take number push in stack");
        if(MAXSTK1==0){
            System.out.println("Pls build Stack first");
             JOptionPane.showMessageDialog(null, "กรุณาสร้าง STACK ก่อนค่ะ");
             return;
        }
        int value;
        value=checkValue(inputStr);
        if(value==-1){
            System.out.println("Pls take number not string");
             JOptionPane.showMessageDialog(null, "กรอกตัวเลขเท่านั้นค่ะ ");
             return;
        }
        if(TOP1==-1){
        if(value<size || value>100){
            System.out.println("Please enter the minimum number between "+size+"-100");
             JOptionPane.showMessageDialog(null, "ครั้งแรกแนะนำให้กรอกตัวเลขตั้งแต่ "+size+"-100 ค่ะ");
             return;
        }}
        if(TOP1!=-1){
            if(value>=STACK1[TOP1]){
                System.out.println("Pls input lower number");
                JOptionPane.showMessageDialog(null, "กรุณาใส่เลขที่น้อยลงกว่าเดิม ");
               
                return;
            }
            if(value< size-(TOP1+1)){
                System.out.println("Enter a positive integer (with space for later values).");
                JOptionPane.showMessageDialog(null, "รบกวนใส่เลขจำนวนเต็มบวก และเผื่อเลขให้ตัวหลังๆด้วยค่ะ ");
               
                return;
            }
        }
        if (TOP1 == MAXSTK1-1) {
            System.out.println("Stack full");
            JOptionPane.showMessageDialog(null, "STACK เต็มค่ะ ");
            
            return;
        }
        PUSH(value);
        showDatainStack();
        jLabel1.setText("TOP1 = "+TOP1);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(TOP1==-1){
            if(TOP2!=-1 || TOP3!=-1){
                    System.out.println("Move data come back to STACK1 for pop");
                JOptionPane.showMessageDialog(null, "ย้ายข้อมูลกลับมาที่ STACK1 ก่อนค่ะ");
                return;
            }
            System.out.println("Stack empty");
                JOptionPane.showMessageDialog(null, "STACK ว่างค่ะ ");
                return;
        }
        jTable1.setValueAt("", ((size-1)-TOP1), 0);
        POP();
        //clearDatainStack();
        jLabel1.setText("TOP1 = "+TOP1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(TOP1==-1){
                System.out.println("Stack1 empty");
                JOptionPane.showMessageDialog(null, "STACK1 ว่างค่ะ ");
                return;
        }
        if(TOP2==size-1){
                System.out.println("Stack2 full");
                JOptionPane.showMessageDialog(null, "STACK2 เต็มค่ะ ");
                return;
        }
        if( TOP1+1>size-(TOP2+1)){
            System.out.println("Stack2 not enough");
                JOptionPane.showMessageDialog(null, "STACK2 ไม่พอใส่ค่ะ ");
                return;
        }
        int K=TOP1;
        for(int i=0;i<=K;i++){
            TOP2++;
            STACK2[TOP2]=STACK1[TOP1];
            jTable1.setValueAt("", ((size-1)-TOP1), 0);
            TOP1--;
        }
        showDatainStack2();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        System.out.println("Move data from STACK1 to STACK2");
        jLabel1.setText("TOP1 = "+TOP1);
        jLabel3.setText("TOP2 = "+TOP2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(TOP1==-1){
                System.out.println("Stack1 empty");
                JOptionPane.showMessageDialog(null, "STACK1 ว่างค่ะ ");
                return;
        }
        if(TOP3==size-1){
                System.out.println("Stack3 full");
                JOptionPane.showMessageDialog(null, "STACK3 เต็มค่ะ ");
                return;
        }
        if( TOP1+1>size-(TOP3+1)){
            System.out.println("Stack3 not enough");
                JOptionPane.showMessageDialog(null, "STACK3 ไม่พอใส่ค่ะ ");
                return;
        }
        int K=TOP1;
        for(int i=0;i<=K;i++){
            TOP3++;
            STACK3[TOP3]=STACK1[TOP1];
            jTable1.setValueAt("", ((size-1)-TOP1), 0);
            TOP1--;
        }
        showDatainStack3();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable3.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Move data from STACK1 to STACK3");
jLabel1.setText("TOP1 = "+TOP1);
jLabel4.setText("TOP3 = "+TOP3);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(TOP2==-1){
                System.out.println("Stack2 empty");
                JOptionPane.showMessageDialog(null, "STACK2 ว่างค่ะ ");
                return;
        }
        if(TOP1==size-1){
                System.out.println("Stack1 full");
                JOptionPane.showMessageDialog(null, "STACK1 เต็มค่ะ ");
                return;
        }
        if( TOP2+1>size-(TOP1+1)){
            System.out.println("Stack1 not enough");
                JOptionPane.showMessageDialog(null, "STACK1 ไม่พอใส่ค่ะ ");
                return;
        }
        int K=TOP2;
        for(int i=0;i<=K;i++){
            TOP1++;
            STACK1[TOP1]=STACK2[TOP2];
            jTable2.setValueAt("", ((size-1)-TOP2), 0);
            TOP2--;
        }
        showDatainStack();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Move data from STACK2 to STACK1");
jLabel1.setText("TOP1 = "+TOP1);
jLabel3.setText("TOP2 = "+TOP2);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(TOP2==-1){
                System.out.println("Stack2 empty");
                JOptionPane.showMessageDialog(null, "STACK2 ว่างค่ะ ");
                return;
        }
        if(TOP3==size-1){
                System.out.println("Stack3 full");
                JOptionPane.showMessageDialog(null, "STACK3 เต็มค่ะ ");
                return;
        }
        if( TOP2+1>size-(TOP3+1)){
            System.out.println("Stack3 not enough");
                JOptionPane.showMessageDialog(null, "STACK3 ไม่พอใส่ค่ะ ");
                return;
        }
        int K=TOP2;
        for(int i=0;i<=K;i++){
            TOP3++;
            STACK3[TOP3]=STACK2[TOP2];
            jTable2.setValueAt("", ((size-1)-TOP2), 0);
            TOP2--;
        }
        showDatainStack3();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable3.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Move data from STACK2 to STACK3");
jLabel3.setText("TOP2 = "+TOP2);
jLabel4.setText("TOP3 = "+TOP3);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(TOP3==-1){
                System.out.println("Stack3 empty");
                JOptionPane.showMessageDialog(null, "STACK3 ว่างค่ะ ");
                return;
        }
        if(TOP1==size-1){
                System.out.println("Stack1 full");
                JOptionPane.showMessageDialog(null, "STACK1 เต็มค่ะ ");
                return;
        }
        if( TOP3+1>size-(TOP1+1)){
            System.out.println("Stack1 not enough");
                JOptionPane.showMessageDialog(null, "STACK1 ไม่พอใส่ค่ะ ");
                return;
        }
        int K=TOP3;
        for(int i=0;i<=K;i++){
            TOP1++;
            STACK1[TOP1]=STACK3[TOP3];
            jTable3.setValueAt("", ((size-1)-TOP3), 0);
            TOP3--;
        }
        showDatainStack();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Move data from STACK3 to STACK1");
jLabel1.setText("TOP1 = "+TOP1);
jLabel4.setText("TOP3 = "+TOP3);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(TOP3==-1){
                System.out.println("Stack3 empty");
                JOptionPane.showMessageDialog(null, "STACK3 ว่างค่ะ ");
                return;
        }
        if(TOP2==size-1){
                System.out.println("Stack2 full");
                JOptionPane.showMessageDialog(null, "STACK2 เต็มค่ะ ");
                return;
        }
        if( TOP3+1>size-(TOP2+1)){
            System.out.println("Stack2 not enough");
                JOptionPane.showMessageDialog(null, "STACK2 ไม่พอใส่ค่ะ ");
                return;
        }
        int K=TOP3;
        for(int i=0;i<=K;i++){
            TOP2++;
            STACK2[TOP2]=STACK3[TOP3];
            jTable3.setValueAt("", ((size-1)-TOP3), 0);
            TOP3--;
        }
        showDatainStack2();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Move data from STACK3 to STACK2");
jLabel3.setText("TOP2 = "+TOP2);
jLabel4.setText("TOP3 = "+TOP3);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(TOP1==-1 && TOP2==-1 && TOP3==-1){
                System.out.println("Stack empty");
                JOptionPane.showMessageDialog(null, "STACK ว่างค่ะ ");
                return;
        }else if(TOP1==-1){
                System.out.println("Pls move data come back to STACK1");
                JOptionPane.showMessageDialog(null, "ย้ายข้อมูลกลับมาที่ STACK1 ก่อนค่ะ ");
                return;
        }
        if(TOP2!=-1 || TOP3!=-1){
            System.out.println("Pls clear STACK2 and STACK3 empty");
                JOptionPane.showMessageDialog(null, "ทำ STACK2 และ STACK3 ให้ว่างก่อนค่ะ");
                return;
        }
        int K=TOP1; 
        for(int i=0;i<=K;i++){
            TOP2++;
            STACK2[TOP2]=STACK1[TOP1];
            jTable1.setValueAt("", ((size-1)-TOP1), 0);
            TOP1--;
        }
        K=TOP2;
        for(int i=0;i<=K;i++){
            TOP3++;
            STACK3[TOP3]=STACK2[TOP2];
            jTable2.setValueAt("", ((size-1)-TOP2), 0);
            TOP2--;
        }
        K=TOP3;
        for(int i=0;i<=K;i++){
            TOP1++;
            STACK1[TOP1]=STACK3[TOP3];
            jTable3.setValueAt("", ((size-1)-TOP3), 0);
            TOP3--;
        }
        showDatainStack();
        showDatainStack2();
        showDatainStack3();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Reverse Number");
        jLabel1.setText("TOP1 = "+TOP1);
          jLabel3.setText("TOP2 = "+TOP2);
        jLabel4.setText("TOP3 = "+TOP3);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(TOP1==-1){
                System.out.println("Stack1 empty");
                JOptionPane.showMessageDialog(null, "STACK1 ว่างค่ะ ");
                return;
        }
        if(TOP2==size-1){
                System.out.println("Stack2 full");
                JOptionPane.showMessageDialog(null, "STACK2 เต็มค่ะ ");
                return;
        }
            TOP2++;
            STACK2[TOP2]=STACK1[TOP1];
            jTable1.setValueAt("", ((size-1)-TOP1), 0);
            TOP1--;
        showDatainStack2();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Pop data from STACK1 to STACK2");
jLabel3.setText("TOP2 = "+TOP2);
jLabel1.setText("TOP1 = "+TOP1);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(TOP2==-1){
                System.out.println("Stack2 empty");
                JOptionPane.showMessageDialog(null, "STACK2 ว่างค่ะ ");
                return;
        }
        if(TOP3==size-1){
                System.out.println("Stack3 full");
                JOptionPane.showMessageDialog(null, "STACK3 เต็มค่ะ ");
                return;
        }
            TOP3++;
            STACK3[TOP3]=STACK2[TOP2];
            jTable2.setValueAt("", ((size-1)-TOP2), 0);
            TOP2--;
        showDatainStack3();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable3.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Pop data from STACK2 to STACK3");
jLabel3.setText("TOP2 = "+TOP2);
jLabel4.setText("TOP3 = "+TOP3);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(TOP3==-1){
                System.out.println("Stack3 empty");
                JOptionPane.showMessageDialog(null, "STACK3 ว่างค่ะ ");
                return;
        }
        if(TOP2==size-1){
                System.out.println("Stack2 full");
                JOptionPane.showMessageDialog(null, "STACK2 เต็มค่ะ ");
                return;
        }
            TOP2++;
            STACK2[TOP2]=STACK3[TOP3];
            jTable3.setValueAt("", ((size-1)-TOP3), 0);
            TOP3--;
        showDatainStack2();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Pop data from STACK3 to STACK2");
jLabel3.setText("TOP2 = "+TOP2);
jLabel4.setText("TOP3 = "+TOP3);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(TOP2==-1){
                System.out.println("Stack2 empty");
                JOptionPane.showMessageDialog(null, "STACK2 ว่างค่ะ ");
                return;
        }
        if(TOP1==size-1){
                System.out.println("Stack1 full");
                JOptionPane.showMessageDialog(null, "STACK1 เต็มค่ะ ");
                return;
        }
            TOP1++;
            STACK1[TOP1]=STACK2[TOP2];
            jTable2.setValueAt("", ((size-1)-TOP2), 0);
            TOP2--;
        showDatainStack();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
centerRenderer.setVerticalAlignment(SwingConstants.CENTER);
jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
System.out.println("Pop data from STACK2 to STACK1");
jLabel3.setText("TOP2 = "+TOP2);
jLabel1.setText("TOP1 = "+TOP1);
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 16));
        UIManager.put("OptionPane.buttonFont", new Font("Tahoma", Font.PLAIN, 16));
        java.awt.EventQueue.invokeLater(() -> new Create().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
