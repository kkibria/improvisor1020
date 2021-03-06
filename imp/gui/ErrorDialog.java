/**
 * This Java Class is part of the Impro-Visor Application
 *
 * Copyright (C) 2005-2009 Robert Keller and Harvey Mudd College
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

/**
 *
 * @author  keller
 */
public class ErrorDialog
        extends javax.swing.JDialog
{
/** Creates new form ErrorDialog */
public ErrorDialog(boolean modal)
  {
  initComponents();
  getRootPane().setDefaultButton(okErrorBtn);
  }


/** This method is called from within the constructor to
 * initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is
 * always regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        errorScroll = new javax.swing.JScrollPane();
        errorText = new javax.swing.JTextPane();
        okErrorBtn = new javax.swing.JButton();

        setTitle("Error or Warning");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 102));
        setModal(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        errorScroll.setMinimumSize(new java.awt.Dimension(400, 200));
        errorScroll.setPreferredSize(new java.awt.Dimension(400, 200));

        errorText.setEditable(false);
        errorText.setMinimumSize(new java.awt.Dimension(400, 400));
        errorText.setPreferredSize(new java.awt.Dimension(400, 400));
        errorScroll.setViewportView(errorText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(errorScroll, gridBagConstraints);

        okErrorBtn.setBackground(new java.awt.Color(0, 255, 0));
        okErrorBtn.setText("OK");
        okErrorBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okErrorBtn.setMinimumSize(new java.awt.Dimension(400, 20));
        okErrorBtn.setOpaque(true);
        okErrorBtn.setPreferredSize(new java.awt.Dimension(400, 20));
        okErrorBtn.setSelected(true);
        okErrorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okErrorBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 20, 5);
        getContentPane().add(okErrorBtn, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void okErrorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okErrorBtnActionPerformed
  setVisible(false);
}//GEN-LAST:event_okErrorBtnActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane errorScroll;
    private javax.swing.JTextPane errorText;
    private javax.swing.JButton okErrorBtn;
    // End of variables declaration//GEN-END:variables


  /**
 * @param args the command line arguments
 */
public javax.swing.JTextPane getTextPane()
  {
  return errorText;
  }

;


/**
 * @param args the command line arguments
 */
public javax.swing.JButton getButton()
  {
  return okErrorBtn;
  }

;
}
