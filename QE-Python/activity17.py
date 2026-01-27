import pandas as pd
data=pd.read_csv("act16.csv")
print(data["Usernames"])
print(data.loc[2,["Usernames","passwords"]])
print("Ascending values")
print(data["Usernames"].sort_values(ascending=True))
print("descinding values")
print(data["passwords"].sort_values(ascending=False))
