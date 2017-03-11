/**
 * CrudZonnepaneelSOAPBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class CrudZonnepaneelSOAPBindingSkeleton implements DefaultNamespace.CrudZonnepaneel_PortType, org.apache.axis.wsdl.Skeleton {
    private DefaultNamespace.CrudZonnepaneel_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DefaultNamespace", "serienummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DefaultNamespace", "postcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createZP", _params, new javax.xml.namespace.QName("http://DefaultNamespace", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://DefaultNamespace", "createZP"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createZP") == null) {
            _myOperations.put("createZP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createZP")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DefaultNamespace", "serienummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DefaultNamespace", "postcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteZP", _params, new javax.xml.namespace.QName("http://DefaultNamespace", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://DefaultNamespace", "deleteZP"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteZP") == null) {
            _myOperations.put("deleteZP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteZP")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DefaultNamespace", "serienummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://DefaultNamespace", "postcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateZP", _params, new javax.xml.namespace.QName("http://DefaultNamespace", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://DefaultNamespace", "updateZP"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateZP") == null) {
            _myOperations.put("updateZP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateZP")).add(_oper);
    }

    public CrudZonnepaneelSOAPBindingSkeleton() {
        this.impl = new DefaultNamespace.CrudZonnepaneelSOAPBindingImpl();
    }

    public CrudZonnepaneelSOAPBindingSkeleton(DefaultNamespace.CrudZonnepaneel_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String createZP(int serienummer, java.lang.String postcode) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.createZP(serienummer, postcode);
        return ret;
    }

    public java.lang.String deleteZP(int serienummer, java.lang.String postcode) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.deleteZP(serienummer, postcode);
        return ret;
    }

    public java.lang.String updateZP(java.lang.String serienummer, java.lang.String postcode) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.updateZP(serienummer, postcode);
        return ret;
    }

}
