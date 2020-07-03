/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author hackimos
 */
public interface Manager<P> {
  ArrayList<P> getAll();
  P FindById(int x);
  ArrayList<P> FindByString(String x);
  boolean Update(P x);
  boolean Delete(P x);
  boolean Insert(P x);
}
