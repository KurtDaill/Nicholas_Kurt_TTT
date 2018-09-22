package kdaill_ncasello.tttbeta;

/**
 * Created by nicholas on 9/22/18.
 */

public class userinterface {
    <?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
            >

    <!--Table Layout with 3 rows and each row with 3 buttons-->
    <TableLayout
    android:id="@+id/glGameBoard"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_centerHorizontal="true"
    android:layout_below="@+id/tvInfo"
    android:rowCount="3"
    android:columnCount="3"
    android:padding="8dp"
            >

        <!--Row 1-->
        <TableRow>

            <Button
    android:id="@+id/b00"
    android:layout_width="80dp"
    android:layout_height="80dp"
    android:textSize="22sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorAccent"
    android:gravity="center"
    android:layout_margin="8dp"
    style="@style/Widget.AppCompat.Button"
            />

            <Button
    android:id="@+id/b01"
    android:layout_width="80dp"
    android:layout_height="80dp"
    android:textSize="22sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorAccent"
    android:gravity="center"
    android:layout_margin="8dp"
    style="@style/Widget.AppCompat.Button"
            />

            <Button
    android:id="@+id/b02"
    android:layout_width="80dp"
    android:layout_height="80dp"
    android:textSize="22sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorAccent"
    android:gravity="center"
    android:layout_margin="8dp"
    style="@style/Widget.AppCompat.Button"
            />

        </TableRow>

        <!--Row 2-->
        <TableRow>

            <Button
    android:id="@+id/b10"
    android:layout_width="80dp"
    android:layout_height="80dp"
    android:textSize="22sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorAccent"
    android:gravity="center"
    android:layout_margin="8dp"
    style="@style/Widget.AppCompat.Button"
            />

            <Button
    android:id="@+id/b11"
    android:layout_width="80dp"
    android:layout_height="80dp"
    android:textSize="22sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorAccent"
    android:gravity="center"
    android:layout_margin="8dp"
    style="@style/Widget.AppCompat.Button"
            />

            <Button
    android:id="@+id/b12"
    android:layout_width="80dp"
    android:layout_height="80dp"
    android:textSize="22sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorAccent"
    android:gravity="center"
    android:layout_margin="8dp"
    style="@style/Widget.AppCompat.Button"
            />

        </TableRow>

        <!--Row 3-->
        <TableRow>

            <Button
    android:id="@+id/b20"
    android:layout_width="80dp"
    android:layout_height="80dp"
    android:textSize="22sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorAccent"
    android:gravity="center"
    android:layout_margin="8dp"
    style="@style/Widget.AppCompat.Button"
            />

            <Button
    android:id="@+id/b21"
    android:layout_width="80dp"
    android:layout_height="80dp"
    android:textSize="22sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorAccent"
    android:gravity="center"
    android:layout_margin="8dp"
    style="@style/Widget.AppCompat.Button"
            />

            <Button
    android:id="@+id/b22"
    android:layout_width="80dp"
    android:layout_height="80dp"
    android:textSize="22sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorAccent"
    android:gravity="center"
    android:layout_margin="8dp"
    style="@style/Widget.AppCompat.Button"
            />

        </TableRow>

    </TableLayout>

    <!--TextView to show user turns and winner-->
    <TextView
    android:id="@+id/tvInfo"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textColor="#424242"
    android:textSize="18sp"
    android:layout_centerHorizontal="true"
    android:layout_margin="16dp"
    android:padding="8dp"
            />

    <!--Button to reset game board-->
    <Button
    android:id="@+id/bReset"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_below="@+id/glGameBoard"
    android:layout_centerHorizontal="true"
    android:layout_margin="16dp"
    android:padding="8dp"
    android:text="RESET"
    android:textSize="18sp"
    android:textColor="#FFFFFF"
    android:background="@color/colorPrimary"
            />

    <GameEngine

            />

    <Grid

            />


</RelativeLayout>
}
