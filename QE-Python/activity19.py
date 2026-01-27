import pandas as pd
data=pd.read_excel("act18.xlsx")
print(f"no of rows {len(data["Firstname"])} and no of columns {len(data.columns)-1}")
print(data["Email"])
print(data["Firstname"].sort_values(ascending=True))