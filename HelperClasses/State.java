package HelperClasses;

public class State {
    public static String JOHOR = "Johor";
    public static String NEGERISEMBILAN = "Negeri Sembilan";
    public static String MALACCA = "Malacca";
    public static String SELANGOR = "Selangor";
    public static String KUALALUMPUR = "Kuala Lumpur";
    public static String PUTRAJAYA = "Putrajaya";
    public static String LABUAN = "Labuan";
    public static String PERAK = "Perak";
    public static String PENANG = "Penang";
    public static String KEDAH = "Kedah";
    public static String PERLIS = "Perlis";
    public static String TERENGGANU = "Terengganu";
    public static String KELANTAN = "Kelantan";
    public static String PAHANG = "Pahang";
    public static String SABAH = "Sabah";
    public static String SARAWAK = "Sarawak";
    
    public static String setStateFileDirectory(String query, String folderName){
        String filePath = null;
        
        if(query.equals(JOHOR)){
            filePath = folderName + System.getProperty("file.separator") + "Johor";
        }else if(query.equals(NEGERISEMBILAN)){
            filePath = folderName + System.getProperty("file.separator") + "NegeriSembilan";
        }else if(query.equals(MALACCA)){
            filePath = folderName + System.getProperty("file.separator") + "Malacca";
        }else if(query.equals(SELANGOR)){
            filePath = folderName + System.getProperty("file.separator") + "Selangor";
        }else if(query.equals(KUALALUMPUR)){
            filePath = folderName + System.getProperty("file.separator") + "KualaLumpur";
        }else if(query.equals(PUTRAJAYA)){
            filePath = folderName + System.getProperty("file.separator") + "Putrajaya";
        }else if(query.equals(LABUAN)){
            filePath = folderName + System.getProperty("file.separator") + "Labuan";
        }else if(query.equals(PERAK)){
            filePath = folderName + System.getProperty("file.separator") + "Perak";
        }else if(query.equals(PENANG)){
            filePath = folderName + System.getProperty("file.separator") + "Penang";
        }else if(query.equals(KEDAH)){
            filePath = folderName + System.getProperty("file.separator") + "Kedah";
        }else if(query.equals(PERLIS)){
            filePath = folderName + System.getProperty("file.separator") + "Perlis";
        }else if(query.equals(TERENGGANU)){
            filePath = folderName + System.getProperty("file.separator") + "Terengganu";
        }else if(query.equals(KELANTAN)){
            filePath = folderName + System.getProperty("file.separator") + "Kelantan";
        }else if(query.equals(PAHANG)){
            filePath = folderName + System.getProperty("file.separator") + "Pahang";
        }else if(query.equals(SABAH)){
            filePath = folderName + System.getProperty("file.separator") + "Sabah";
        }else if(query.equals(SARAWAK)){
            filePath = folderName + System.getProperty("file.separator") + "Sarawak";
        }
        
        return filePath;
    }
    
    public static String getStateFileDirectory(String query, String folderName){
        String filePath = null;
        
        if(query.equals(JOHOR)){
            filePath = folderName + System.getProperty("file.separator") + "Johor";
        }else if(query.equals(NEGERISEMBILAN)){
            filePath = folderName + System.getProperty("file.separator") + "NegeriSembilan";
        }else if(query.equals(MALACCA)){
            filePath = folderName + System.getProperty("file.separator") + "Malacca";
        }else if(query.equals(SELANGOR)){
            filePath = folderName + System.getProperty("file.separator") + "Selangor";
        }else if(query.equals(KUALALUMPUR)){
            filePath = folderName + System.getProperty("file.separator") + "KualaLumpur";
        }else if(query.equals(PUTRAJAYA)){
            filePath = folderName + System.getProperty("file.separator") + "Putrajaya";
        }else if(query.equals(LABUAN)){
            filePath = folderName + System.getProperty("file.separator") + "Labuan";
        }else if(query.equals(PERAK)){
            filePath = folderName + System.getProperty("file.separator") + "Perak";
        }else if(query.equals(PENANG)){
            filePath = folderName + System.getProperty("file.separator") + "Penang";
        }else if(query.equals(KEDAH)){
            filePath = folderName + System.getProperty("file.separator") + "Kedah";
        }else if(query.equals(PERLIS)){
            filePath = folderName + System.getProperty("file.separator") + "Perlis";
        }else if(query.equals(TERENGGANU)){
            filePath = folderName + System.getProperty("file.separator") + "Terengganu";
        }else if(query.equals(KELANTAN)){
            filePath = folderName + System.getProperty("file.separator") + "Kelantan";
        }else if(query.equals(PAHANG)){
            filePath = folderName + System.getProperty("file.separator") + "Pahang";
        }else if(query.equals(SABAH)){
            filePath = folderName + System.getProperty("file.separator") + "Sabah";
        }else if(query.equals(SARAWAK)){
            filePath = folderName + System.getProperty("file.separator") + "Sarawak";
        }
        
        return filePath;
    }
}
