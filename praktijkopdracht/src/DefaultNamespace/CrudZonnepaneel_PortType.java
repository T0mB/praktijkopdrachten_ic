/**
 * CrudZonnepaneel_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface CrudZonnepaneel_PortType extends java.rmi.Remote {
    public java.lang.String createZP(int serienummer, java.lang.String postcode) throws java.rmi.RemoteException;
    public java.lang.String deleteZP(int serienummer, java.lang.String postcode) throws java.rmi.RemoteException;
    public java.lang.String updateZP(java.lang.String serienummer, java.lang.String postcode) throws java.rmi.RemoteException;
}
