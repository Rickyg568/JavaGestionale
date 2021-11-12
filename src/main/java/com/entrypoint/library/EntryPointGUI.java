package com.entrypoint.library;

public class EntryPointGUI extends javax.swing.JFrame {
    Controller myController = new Controller(); 
    Boolean ThisFrameVisible = true;
    Boolean AddFrameVisible = false;
    Boolean ModFrameVisible = false;
    Boolean RemoveFrameVisible = false;
    
    private void PrintBooks(){
        String toPrint = new String();
        
        for(Book a : myController.GetList())
            toPrint += 
                    
                    (   "\n----------------------------------------------------------------------------------------------------\n" +
                        myController.GetList().indexOf(a) +") Title : "+a.getName() +
                        "\n" +
                        " Author : "+a.getAuthors() +
                        "\n" +
                        " Genre : "+a.getGenres() +
                        "\n----------------------------------------------------------------------------------------------------\n"
                    );
        
        System.out.println(toPrint);
        TextBox.setText(toPrint);
    }
    public EntryPointGUI() {
        initComponents();
        //TESTING COMPONENTS
        Book first = new Book("Harry potter","Fantasy","JK R");
        Book second = new Book("La Coscienza di Zeno","Psicology","Svevo");
        Book third = new Book("Hunger Games","Fantasy","SOMEONE");
        myController.AddBook(first);
        myController.AddBook(second);
        myController.AddBook(third);
        //TESTING COMPONENTS        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        addBlock = new javax.swing.JFrame();
        addBook = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        aut = new javax.swing.JTextField();
        gen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        modBlock = new javax.swing.JFrame();
        MOD = new javax.swing.JButton();
        nameMod = new javax.swing.JTextField();
        autMod = new javax.swing.JTextField();
        genMod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        removeBlock = new javax.swing.JFrame();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextBox = new javax.swing.JTextArea();
        addB = new javax.swing.JButton();
        modB = new javax.swing.JButton();
        editB = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        addBlock.setTitle("Add Book");
        addBlock.setBounds(new java.awt.Rectangle(0, 0, 1024, 720));
        addBlock.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                addBlockWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                addBlockWindowClosing(evt);
            }
        });

        addBook.setText("ADD");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        jLabel1.setText("Book Name");

        jLabel2.setText("Book Author");

        jLabel3.setText("Book Genre");

        javax.swing.GroupLayout addBlockLayout = new javax.swing.GroupLayout(addBlock.getContentPane());
        addBlock.getContentPane().setLayout(addBlockLayout);
        addBlockLayout.setHorizontalGroup(
            addBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBlockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(103, 103, 103)
                .addGroup(addBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBlockLayout.createSequentialGroup()
                        .addGroup(addBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aut)
                            .addComponent(gen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name))
                        .addContainerGap())
                    .addGroup(addBlockLayout.createSequentialGroup()
                        .addComponent(addBook, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                        .addGap(140, 140, 140))))
        );
        addBlockLayout.setVerticalGroup(
            addBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBlockLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(addBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBlockLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBlockLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(aut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBlockLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(222, 222, 222)
                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        modBlock.setBounds(new java.awt.Rectangle(0, 0, 1024, 720));
        modBlock.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                modBlockWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                modBlockWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                modBlockWindowOpened(evt);
            }
        });

        MOD.setText("Mod");
        MOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODActionPerformed(evt);
            }
        });

        nameMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameModActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Author");

        jLabel6.setText("Genre");

        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modBlockLayout = new javax.swing.GroupLayout(modBlock.getContentPane());
        modBlock.getContentPane().setLayout(modBlockLayout);
        modBlockLayout.setHorizontalGroup(
            modBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modBlockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MOD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(modBlockLayout.createSequentialGroup()
                        .addGroup(modBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(modBlockLayout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addGroup(modBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(modBlockLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(40, 40, 40)
                        .addGroup(modBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autMod, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addComponent(genMod)
                            .addComponent(nameMod))))
                .addContainerGap())
        );
        modBlockLayout.setVerticalGroup(
            modBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modBlockLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(modBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(modBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(251, 251, 251)
                .addComponent(MOD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        removeBlock.setBounds(new java.awt.Rectangle(0, 0, 1024, 720));
        removeBlock.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                removeBlockWindowActivated(evt);
            }
        });

        jComboBox2.setSelectedIndex(-1);
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton2.setText("REMOVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeBlockLayout = new javax.swing.GroupLayout(removeBlock.getContentPane());
        removeBlock.getContentPane().setLayout(removeBlockLayout);
        removeBlockLayout.setHorizontalGroup(
            removeBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeBlockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(removeBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(removeBlockLayout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 624, Short.MAX_VALUE)))
                .addContainerGap())
        );
        removeBlockLayout.setVerticalGroup(
            removeBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeBlockLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Manager");
        setBounds(new java.awt.Rectangle(0, 0, 1024, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Print all Books");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextBox.setEditable(false);
        TextBox.setColumns(20);
        TextBox.setRows(5);
        jScrollPane2.setViewportView(TextBox);

        addB.setText("Add Book");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        modB.setText("Mod Book");
        modB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBActionPerformed(evt);
            }
        });

        editB.setText("Remove Book");
        editB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addB, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modB, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editB, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(addB)
                    .addComponent(modB)
                    .addComponent(editB)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrintBooks();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        // TODO add your handling code here:
        AddFrameVisible = true;
        ThisFrameVisible = false;
        
        addBlock.setVisible(AddFrameVisible);
        this.setVisible(ThisFrameVisible);
    }//GEN-LAST:event_addBActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        myController.AddBook(new Book(name.getText(),gen.getText(),aut.getText()));
        AddFrameVisible = false;
        ThisFrameVisible = true;
        
        addBlock.setVisible(AddFrameVisible);
        this.setVisible(ThisFrameVisible);
    }//GEN-LAST:event_addBookActionPerformed

    private void addBlockWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_addBlockWindowClosed
        // TODO add your handling code here:
        ThisFrameVisible = true;
        this.setVisible(ThisFrameVisible);
        PrintBooks();        
    }//GEN-LAST:event_addBlockWindowClosed

    private void addBlockWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_addBlockWindowClosing
        ThisFrameVisible = true;
        this.setVisible(ThisFrameVisible);
    }//GEN-LAST:event_addBlockWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        PrintBooks();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       PrintBooks();
    }//GEN-LAST:event_formWindowActivated

    private void modBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modBActionPerformed
        // TODO add your handling code here:
        ModFrameVisible = true;
        ThisFrameVisible = false;
        this.setVisible(ThisFrameVisible);
        modBlock.setVisible(ModFrameVisible);
    }//GEN-LAST:event_modBActionPerformed

    private void modBlockWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_modBlockWindowOpened

    }//GEN-LAST:event_modBlockWindowOpened

    private void modBlockWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_modBlockWindowClosing
        // TODO add your handling code here:
        ThisFrameVisible = true;
        this.setVisible(ThisFrameVisible);
    }//GEN-LAST:event_modBlockWindowClosing

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void MODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODActionPerformed
        String name = nameMod.getText();
        String Author = autMod.getText();
        String Genre = genMod.getText();
        
        if(name.isEmpty())
            name = myController.GetList().get(jComboBox1.getSelectedIndex()).getName();

         if(Author.isEmpty())
            Author = myController.GetList().get(jComboBox1.getSelectedIndex()).getAuthors();
         
          if(Genre.isEmpty())
            Genre = myController.GetList().get(jComboBox1.getSelectedIndex()).getGenres();
        
        myController.ModBook(name, Genre, Author, jComboBox1.getSelectedIndex());
        ThisFrameVisible = true;
        ModFrameVisible = false;
         modBlock.setVisible(ModFrameVisible);
         this.setVisible(ThisFrameVisible);
        
    }//GEN-LAST:event_MODActionPerformed

    private void nameModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameModActionPerformed

    private void editBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBActionPerformed
        RemoveFrameVisible = true;
        ThisFrameVisible = false;
        
        removeBlock.setVisible(RemoveFrameVisible);
        this.setVisible(ThisFrameVisible);
    }//GEN-LAST:event_editBActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged


    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void modBlockWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_modBlockWindowActivated
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
          for(Book a : myController.GetList())
            jComboBox1.addItem(a.getName());
    }//GEN-LAST:event_modBlockWindowActivated

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void removeBlockWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_removeBlockWindowActivated
        // TODO add your handling code here:
               // TODO add your handling code here:
        jComboBox2.removeAllItems();
          for(Book a : myController.GetList())
            jComboBox2.addItem(a.getName());
    }//GEN-LAST:event_removeBlockWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RemoveFrameVisible = false;
        ThisFrameVisible = true;
        
        myController.DeleteBook(jComboBox2.getSelectedIndex());
        
        
        removeBlock.setVisible(RemoveFrameVisible);
        this.setVisible(ThisFrameVisible);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EntryPointGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryPointGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryPointGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryPointGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryPointGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MOD;
    private javax.swing.JTextArea TextBox;
    private javax.swing.JButton addB;
    private javax.swing.JFrame addBlock;
    private javax.swing.JButton addBook;
    private javax.swing.JTextField aut;
    private javax.swing.JTextField autMod;
    private javax.swing.JButton editB;
    private javax.swing.JTextField gen;
    private javax.swing.JTextField genMod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton modB;
    private javax.swing.JFrame modBlock;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nameMod;
    private javax.swing.JFrame removeBlock;
    // End of variables declaration//GEN-END:variables
}
