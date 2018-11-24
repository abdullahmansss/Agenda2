package mans.abdullah.abdullah_mansour.agenda2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<DataClass> {
    ImageView book_image;
    TextView book_name,book_author;

    public Adapter(@NonNull Context context, int resource, ArrayList<DataClass> booksarraylist)
    {
        super(context, resource, booksarraylist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        DataClass dataClass = getItem(position);

        book_image = convertView.findViewById(R.id.book_image);
        book_name = convertView.findViewById(R.id.book_name);
        book_author = convertView.findViewById(R.id.book_author);

        book_name.setText(dataClass.getBookname());
        book_author.setText(dataClass.getBookauthor());

        Picasso
                .get()
                .load(dataClass.getImageurl())
                .placeholder(R.drawable.survey)
                .into(book_image);

        return convertView;
    }
}
