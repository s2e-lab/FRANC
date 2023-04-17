import matplotlib.pyplot as plt

def subplot(x:list, y:list, nrows:int, ncols:int):
    '''
    Create a subplot with nrows rows and ncols columns and plot the data in x and y
    '''
    fig, ax = plt.subplots(nrows, ncols)
    for i in range(nrows):
        for j in range(ncols):
            ax[i,j].plot(x, y)
    plt.show()
