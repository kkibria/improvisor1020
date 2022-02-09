/**
 * This Java Class is part of the Impro-Visor Application
 *
 * Copyright (C) 2005-2017 Robert Keller and Harvey Mudd College
 *
 * Impro-Visor is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * Impro-Visor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * merchantability or fitness for a particular purpose.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Impro-Visor; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package imp.gui;

import imp.Constants;

/**
 *
 * @author keller
 */
public class SaveLickDialog extends javax.swing.JDialog
  {
    Notate notate;
    
    // This Mode is the default, selected when dialog first opens.
    Constants.ExtractMode saveSelectionMode = Constants.ExtractMode.LICK;

    /**
     * Creates new form SaveLick
     */
    public SaveLickDialog(Notate notate, boolean modal)
    {
        super(notate, modal);
        initComponents();
        this.notate = notate;
        setSize(850, 300);
        getRootPane().setDefaultButton(okSaveButton);
        enterLickTitle.requestFocusInWindow();
    }
    
    public void setSaveName(String string)
    {
        enterLickTitle.setText(string);
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        saveLickButtonGroup = new javax.swing.ButtonGroup();
        lickTItleLabel = new javax.swing.JLabel();
        enterLickTitle = new javax.swing.JTextField();
        lineLabel = new javax.swing.JLabel();
        cancelLickTitle = new javax.swing.JButton();
        okSaveButton = new javax.swing.JButton();
        rhythmRadioButton = new javax.swing.JRadioButton();
        cellRadioButton = new javax.swing.JRadioButton();
        idiomRadioButton = new javax.swing.JRadioButton();
        lickRadioButton = new javax.swing.JRadioButton();
        quoteRadioButton = new javax.swing.JRadioButton();
        brickRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 325));
        setPreferredSize(new java.awt.Dimension(1000, 325));
        setSize(new java.awt.Dimension(1000, 325));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lickTItleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lickTItleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lickTItleLabel.setText("Save Selection in Vocabulary as ...");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 653;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 45, 0, 46);
        getContentPane().add(lickTItleLabel, gridBagConstraints);

        enterLickTitle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        enterLickTitle.setText("unnamed");
        enterLickTitle.setToolTipText("The name to be given to the selection (need not be unique)");
        enterLickTitle.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        enterLickTitle.setMinimumSize(new java.awt.Dimension(200, 30));
        enterLickTitle.setPreferredSize(new java.awt.Dimension(400, 30));
        enterLickTitle.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                enterLickTitleGetsFocus(evt);
            }
        });
        enterLickTitle.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                enterLickTitleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 0, 5);
        getContentPane().add(enterLickTitle, gridBagConstraints);

        lineLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lineLabel.setText("Save with name: ");
        lineLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lineLabel.setMaximumSize(new java.awt.Dimension(150, 30));
        lineLabel.setMinimumSize(new java.awt.Dimension(150, 30));
        lineLabel.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(40, 45, 0, 0);
        getContentPane().add(lineLabel, gridBagConstraints);

        cancelLickTitle.setBackground(java.awt.Color.red);
        cancelLickTitle.setText("Cancel");
        cancelLickTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelLickTitle.setDefaultCapable(false);
        cancelLickTitle.setOpaque(true);
        cancelLickTitle.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelLickTitleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 5, 5);
        getContentPane().add(cancelLickTitle, gridBagConstraints);

        okSaveButton.setBackground(java.awt.Color.green);
        okSaveButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        okSaveButton.setText("Save This");
        okSaveButton.setToolTipText("Saves the item in the vocabulary file.");
        okSaveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okSaveButton.setOpaque(true);
        okSaveButton.setSelected(true);
        okSaveButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                okSaveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 5, 5);
        getContentPane().add(okSaveButton, gridBagConstraints);

        saveLickButtonGroup.add(rhythmRadioButton);
        rhythmRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rhythmRadioButton.setText("Rhythm");
        rhythmRadioButton.setToolTipText("Save as rhythm when saving.");
        rhythmRadioButton.setMargin(new java.awt.Insets(1, 5, 0, 0));
        rhythmRadioButton.setMinimumSize(new java.awt.Dimension(150, 50));
        rhythmRadioButton.setPreferredSize(new java.awt.Dimension(150, 50));
        rhythmRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rhythmRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        getContentPane().add(rhythmRadioButton, gridBagConstraints);

        saveLickButtonGroup.add(cellRadioButton);
        cellRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cellRadioButton.setText("Cell");
        cellRadioButton.setToolTipText("Save as cell when saving.");
        cellRadioButton.setMargin(new java.awt.Insets(1, 5, 0, 0));
        cellRadioButton.setMinimumSize(new java.awt.Dimension(150, 50));
        cellRadioButton.setPreferredSize(new java.awt.Dimension(150, 50));
        cellRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cellRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        getContentPane().add(cellRadioButton, gridBagConstraints);

        saveLickButtonGroup.add(idiomRadioButton);
        idiomRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        idiomRadioButton.setText("Idiom");
        idiomRadioButton.setToolTipText("Save as idiom when saving.");
        idiomRadioButton.setMargin(new java.awt.Insets(1, 5, 0, 0));
        idiomRadioButton.setMinimumSize(new java.awt.Dimension(150, 50));
        idiomRadioButton.setPreferredSize(new java.awt.Dimension(150, 50));
        idiomRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                idiomRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        getContentPane().add(idiomRadioButton, gridBagConstraints);

        saveLickButtonGroup.add(lickRadioButton);
        lickRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lickRadioButton.setSelected(true);
        lickRadioButton.setText("Lick");
        lickRadioButton.setToolTipText("Save as lick when saving.");
        lickRadioButton.setMargin(new java.awt.Insets(1, 5, 0, 0));
        lickRadioButton.setMinimumSize(new java.awt.Dimension(150, 50));
        lickRadioButton.setPreferredSize(new java.awt.Dimension(150, 50));
        lickRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                lickRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        getContentPane().add(lickRadioButton, gridBagConstraints);

        saveLickButtonGroup.add(quoteRadioButton);
        quoteRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        quoteRadioButton.setText("Quote");
        quoteRadioButton.setToolTipText("Save as quote when saving.");
        quoteRadioButton.setMargin(new java.awt.Insets(1, 5, 0, 0));
        quoteRadioButton.setMinimumSize(new java.awt.Dimension(150, 50));
        quoteRadioButton.setPreferredSize(new java.awt.Dimension(150, 50));
        quoteRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quoteRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        getContentPane().add(quoteRadioButton, gridBagConstraints);

        saveLickButtonGroup.add(brickRadioButton);
        brickRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        brickRadioButton.setText("Brick");
        brickRadioButton.setToolTipText("Save as brick when saving");
        brickRadioButton.setMargin(new java.awt.Insets(1, 5, 0, 0));
        brickRadioButton.setMinimumSize(new java.awt.Dimension(150, 50));
        brickRadioButton.setPreferredSize(new java.awt.Dimension(150, 50));
        brickRadioButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                brickRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        getContentPane().add(brickRadioButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterLickTitleGetsFocus(java.awt.event.FocusEvent evt)//GEN-FIRST:event_enterLickTitleGetsFocus
    {//GEN-HEADEREND:event_enterLickTitleGetsFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_enterLickTitleGetsFocus

    private void enterLickTitleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_enterLickTitleActionPerformed
    {//GEN-HEADEREND:event_enterLickTitleActionPerformed
           okSaveButtonActionPerformed(evt);
    }//GEN-LAST:event_enterLickTitleActionPerformed

    private void cancelLickTitleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelLickTitleActionPerformed
    {//GEN-HEADEREND:event_cancelLickTitleActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelLickTitleActionPerformed

    private void okSaveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_okSaveButtonActionPerformed
    {//GEN-HEADEREND:event_okSaveButtonActionPerformed
        String text = enterLickTitle.getText().trim();
        if( text.equals("") )
          {
            text = "unnamed";
          }
        notate.saveSelection(saveSelectionMode, text);        
    }//GEN-LAST:event_okSaveButtonActionPerformed

    private void rhythmRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rhythmRadioButtonActionPerformed
    {//GEN-HEADEREND:event_rhythmRadioButtonActionPerformed
        saveSelectionMode = Constants.ExtractMode.RHYTHM;
    }//GEN-LAST:event_rhythmRadioButtonActionPerformed

    private void cellRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cellRadioButtonActionPerformed
    {//GEN-HEADEREND:event_cellRadioButtonActionPerformed
        saveSelectionMode = Constants.ExtractMode.CELL;
    }//GEN-LAST:event_cellRadioButtonActionPerformed

    private void idiomRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_idiomRadioButtonActionPerformed
    {//GEN-HEADEREND:event_idiomRadioButtonActionPerformed
        saveSelectionMode = Constants.ExtractMode.IDIOM;
    }//GEN-LAST:event_idiomRadioButtonActionPerformed

    private void lickRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_lickRadioButtonActionPerformed
    {//GEN-HEADEREND:event_lickRadioButtonActionPerformed
        saveSelectionMode = Constants.ExtractMode.LICK;
    }//GEN-LAST:event_lickRadioButtonActionPerformed

    private void quoteRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quoteRadioButtonActionPerformed
    {//GEN-HEADEREND:event_quoteRadioButtonActionPerformed
        saveSelectionMode = Constants.ExtractMode.QUOTE;
    }//GEN-LAST:event_quoteRadioButtonActionPerformed

    private void brickRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_brickRadioButtonActionPerformed
    {//GEN-HEADEREND:event_brickRadioButtonActionPerformed
        saveSelectionMode = Constants.ExtractMode.BRICK;
    }//GEN-LAST:event_brickRadioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton brickRadioButton;
    private javax.swing.JButton cancelLickTitle;
    private javax.swing.JRadioButton cellRadioButton;
    private javax.swing.JTextField enterLickTitle;
    private javax.swing.JRadioButton idiomRadioButton;
    private javax.swing.JRadioButton lickRadioButton;
    private javax.swing.JLabel lickTItleLabel;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JButton okSaveButton;
    private javax.swing.JRadioButton quoteRadioButton;
    private javax.swing.JRadioButton rhythmRadioButton;
    private javax.swing.ButtonGroup saveLickButtonGroup;
    // End of variables declaration//GEN-END:variables
  }
