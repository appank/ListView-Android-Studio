# ListView Android Studio
Membuat Listview  menggunakan Android studio, memanggil intem di listview, atau pidah activity 

**Untuk memanggil data yang ada pada ListView menggunakan Toast**
```MainActivity.java
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Toast.makeText(getApplicationContext(), "Item Clik 0",Toast.LENGTH_LONG).show();
                    }
            }        
    }
```
**Untuk pindah activity pada ListView**
```MainActivity.java
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                 @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {  
                  if (position==0){
                    Intent intent = new Intent(view.getContext(),item_clik0.class);
                    startActivityForResult(intent, 0);
                    }
            }
       }  
```

