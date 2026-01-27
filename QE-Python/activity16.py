import pandas as pd
data = {"Usernames":["admin","charles","Deku"],
        "passwords":["passwords","charle123","allmight"]}
df=pd.DataFrame(data)
df.to_csv("act16.csv", index=False)